package com.andersondev.cliente.controller;

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
	
	
	public ClienteCriadoResponse(Clientes clientes) {
		this.idCliente = clientes.getIdCliente();
		this.email = clientes.getEmail();
		this.nome = clientes.getNome();
		this.status = clientes.getStatus();
	}
	
}
