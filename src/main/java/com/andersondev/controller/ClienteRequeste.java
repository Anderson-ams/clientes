package com.andersondev.controller;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.Value;

@Value
public class ClienteRequeste {

	@Email
	private final String email;
	@Size(min = 6)
	private final String senha;
}
