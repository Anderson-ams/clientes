package com.andersondev.cliente.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.andersondev.cliente.domain.Clientes;

public interface ClienteMongoRepository extends MongoRepository<Clientes, UUID>{

}
