package com.gabriel.gof.model.dto;

import com.gabriel.gof.model.Cliente;
import jakarta.validation.constraints.NotBlank;

public record InserirClienteDTO(
        @NotBlank(message = "Nome é obrigatório!") String nome,
        @NotBlank(message = "CEP é obrigatório!") String cep) {
    public Cliente toEntity() {
        return new Cliente(nome(), cep());
    }
}
