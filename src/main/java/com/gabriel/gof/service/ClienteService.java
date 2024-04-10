package com.gabriel.gof.service;

import com.gabriel.gof.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Cliente cliente);
    void deletar(Long id);
}
