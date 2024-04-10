package com.gabriel.gof.service.impl;

import com.gabriel.gof.model.Cliente;
import com.gabriel.gof.model.Endereco;
import com.gabriel.gof.repository.ClienteRepository;
import com.gabriel.gof.repository.EnderecoRepository;
import com.gabriel.gof.service.ClienteService;
import com.gabriel.gof.service.ViaCepService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;
    private final EnderecoRepository enderecoRepository;
    private final ViaCepService viaCepService;

    public ClienteServiceImpl(ClienteRepository clienteRepository, EnderecoRepository enderecoRepository, ViaCepService viaCepService) {
        this.clienteRepository = clienteRepository;
        this.enderecoRepository = enderecoRepository;
        this.viaCepService = viaCepService;
    }

    @Override
    public List<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return clienteRepository
                .findById(id)
                .orElseThrow(() -> new NoSuchElementException("Cliente não encontrado"));
    }

    @Override
    public Cliente inserir(Cliente cliente) {
        atribuirCep(cliente);
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente atualizar(Long id, Cliente cliente) {
        Cliente clienteBD = clienteRepository
                .findById(id)
                .orElseThrow(() -> new NoSuchElementException("Cliente não encontrado!"));

        clienteBD.setNome(cliente.getNome());
        atribuirCep(cliente);

        return clienteRepository.save(clienteBD);
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    private void atribuirCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();

        Endereco endereco = enderecoRepository.findById(cep)
                .orElseGet(() -> {
                    Endereco novoEndereco = viaCepService.consultarCep(cep);
                    return enderecoRepository.save(novoEndereco);
                });

        cliente.setEndereco(endereco);
    }
}
