package com.andersondev.cliente.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.andersondev.cliente.controller.ClienteCriadoResponse;
import com.andersondev.cliente.controller.ClienteRequeste;
import com.andersondev.cliente.domain.Clientes;

import lombok.extern.log4j.Log4j2;

@Service
@Validated
@Log4j2
public class ClienteService implements ClienteApplicationService {

	private UsuarioRepository usuarioRepository;

	@Override
	public ClienteCriadoResponse criaNovoCliente(@Valid ClienteRequeste clienteNovo) {
		log.info("[start] ClienteService - criaNovoCliente");
		Clientes clientes = new Clientes(clienteNovo);
		usuarioRepository.salva(clientes);
		log.info("[finish] ClienteService - criaNovoCliente");
		return new ClienteCriadoResponse(clientes);
	}

}
