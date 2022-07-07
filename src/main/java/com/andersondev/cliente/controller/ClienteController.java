package com.andersondev.cliente.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import com.andersondev.cliente.service.ClienteApplicationService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI{

	private final ClienteApplicationService clienteApplicationService;

	@Override
	public ClienteCriadoResponse postNovoUsuario(@Valid ClienteRequeste clienteNovo) {
		log.info("[start] ClienteController - postNovoCliente");
		ClienteCriadoResponse addNovoCliente = clienteApplicationService.criaNovoCliente(clienteNovo);
		return addNovoCliente;
	}

}
