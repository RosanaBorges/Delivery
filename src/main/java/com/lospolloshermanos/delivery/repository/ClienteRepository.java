package com.lospolloshermanos.delivery.repository;

import com.lospolloshermanos.delivery.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
