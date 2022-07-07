package com.andersondev.cliente.service;

import javax.validation.Valid;

import com.andersondev.cliente.controller.ClienteCriadoResponse;
import com.andersondev.cliente.controller.ClienteRequeste;

public interface ClienteApplicationService {

	ClienteCriadoResponse criaNovoCliente(@Valid ClienteRequeste clienteNovo);

}
