package com.lospolloshermanos.delivery.controller;

import com.lospolloshermanos.delivery.domain.Cliente;
import com.lospolloshermanos.delivery.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/clientes")

public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente save(@Valid @RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
    }

    @GetMapping("buscar/{id}")
    public Optional<Cliente> buscarClientePorId(@PathVariable Long id) {
        return clienteService.buscarClientePorId(id);
    }

    @GetMapping("buscarTodos")
    public List<Cliente> buscarTodosClientes(){
        return clienteService.buscarTodosClientes();
    }

    @PutMapping("atualizar/{id}")
    public Cliente atualizar(@PathVariable Long id, @Valid @RequestBody Cliente cliente){
        return clienteService.atualizar(id, cliente);

    }

}
