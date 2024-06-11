package com.lospolloshermanos.delivery.service;

import com.lospolloshermanos.delivery.domain.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    Cliente salvar(Cliente cliente);

    Optional<Cliente> buscarClientePorId(Long id);

    List<Cliente> buscarTodosClientes();

    Cliente atualizar(Long id, Cliente cliente);

    Cliente deletar(Long id, Cliente cliente);
}
