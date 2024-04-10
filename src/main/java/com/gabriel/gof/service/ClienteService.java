package com.gabriel.gof.service;

import com.gabriel.gof.model.Cliente;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ClienteService {
    List<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    Cliente inserir(Cliente cliente);
    Cliente atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
