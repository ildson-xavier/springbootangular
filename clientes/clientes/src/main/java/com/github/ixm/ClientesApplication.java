package com.github.ixm;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.github.ixm.model.entity.Cliente;
import com.github.ixm.model.repository.ClienteRepository;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ClientesApplication {

	@Bean
	public CommandLineRunner run(@Autowired ClienteRepository clienteRepository) {
		
		return args -> {
			Cliente cliente = new Cliente(1, "Ildson", "32323232", LocalDate.now());
			clienteRepository.save(cliente);
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
