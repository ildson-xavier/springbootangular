package com.github.ixm.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.ixm.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	
}
