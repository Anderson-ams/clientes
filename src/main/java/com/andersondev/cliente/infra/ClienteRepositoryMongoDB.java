package com.andersondev.cliente.infra;

import org.springframework.stereotype.Repository;

import com.andersondev.cliente.domain.Clientes;
import com.andersondev.cliente.service.ClienteRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ClienteRepositoryMongoDB implements ClienteRepository {

	private final ClienteMongoRepository clienteMongoRepository;

	@Override
	public Clientes salva(Clientes clientes) {
		return clienteMongoRepository.save(clientes);
	}

}
