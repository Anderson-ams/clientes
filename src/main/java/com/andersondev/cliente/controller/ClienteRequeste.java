package com.andersondev.cliente.controller;

import javax.validation.constraints.Email;

import lombok.Value;

@Value
public class ClienteRequeste {

	@Email
	private final String email;
	private final String nome;
}
