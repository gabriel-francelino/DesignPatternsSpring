package com.gabriel.gof.controller;

import com.gabriel.gof.model.Cliente;
import com.gabriel.gof.model.dto.AtualizarClienteDTO;
import com.gabriel.gof.model.dto.InserirClienteDTO;
import com.gabriel.gof.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody @Valid InserirClienteDTO clienteDTO) {
        Cliente novoCliente = clienteService.inserir(clienteDTO.toEntity());
        return ResponseEntity
                .created(URI.create("localhost:8080/clientes/" + novoCliente.getId()))
                .body(novoCliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizarClienteDTO clienteDTO) {
        Cliente clienteAtualizado = clienteService.atualizar(id, clienteDTO.toEntity());
        return ResponseEntity.ok(clienteAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        clienteService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
