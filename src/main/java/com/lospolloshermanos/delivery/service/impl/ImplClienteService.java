package com.lospolloshermanos.delivery.service.impl;

import com.lospolloshermanos.delivery.domain.Cliente;
import com.lospolloshermanos.delivery.repository.ClienteRepository;
import com.lospolloshermanos.delivery.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ImplClienteService implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Optional<Cliente> buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> buscarTodosClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente atualizar(Long id, Cliente cliente) {
        Optional<Cliente> existeCliente = clienteRepository.findById(id);
        if (existeCliente.isPresent()) {
            Cliente atualizarCliente = existeCliente.get();
            atualizarCliente.setNomeCompleto(cliente.getNomeCompleto());
            atualizarCliente.setEmail(cliente.getEmail());
            atualizarCliente.setCpf(cliente.getCpf());
            atualizarCliente.setRua(cliente.getRua());
            atualizarCliente.setBairro(cliente.getBairro());
            atualizarCliente.setNumeroResidencia(cliente.getNumeroResidencia());
            atualizarCliente.setComplemento(cliente.getComplemento());
            atualizarCliente.setCep(cliente.getCep());
            return clienteRepository.save(atualizarCliente);
        } else {
            throw new RuntimeException("Cliente não encontrado com o ID: " + id);
        }
    }

    @Override
    public Cliente deletar(Long id, Cliente cliente) {
        return null;
    }

}
