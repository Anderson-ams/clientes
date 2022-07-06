package com.andersondev.controller;

import java.util.UUID;

import com.andersondev.cliente.domain.Clientes;
import com.andersondev.cliente.domain.StatusCliente;

import lombok.Value;

@Value
public class ClienteCriadoResponse {
	
	private final UUID idCliente;
	private final String email;
	private final String nome;
	private final StatusCliente status;
	
	
	public ClienteCriadoResponse(Clientes cliente) {
		this.idCliente = cliente.getIdCliente();
		this.email = cliente.getEmail();
		this.nome = cliente.getNome();
		this.status = cliente.getStatus();
	}
	
}
