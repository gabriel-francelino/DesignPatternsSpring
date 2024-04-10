package com.gabriel.gof.model.dto;

import com.gabriel.gof.model.Cliente;
import com.gabriel.gof.model.Endereco;
import jakarta.validation.constraints.NotBlank;

public record AtualizarClienteDTO(
        @NotBlank(message = "Nome é obrigatório!") String nome,
        @NotBlank(message = "Endereço é obrigatório!") Endereco endereco) {
    public Cliente toEntity() {
        return new Cliente(nome(), endereco());
    }
}
