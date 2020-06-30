package com.github.ixm.model.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Servico {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Integer id;
	public String descricao;
	
	@ManyToOne
	@JoinColumn (name = "id_cliente")
	public Cliente cliente;
	
	public BigDecimal valor;
	
}
