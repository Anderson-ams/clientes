package com.andersondev.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/public/cliente")
public interface ClienteAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ClienteCriadoResponse postNovoUsuario(@RequestBody @Valid ClienteRequeste clienteNovo);
}
