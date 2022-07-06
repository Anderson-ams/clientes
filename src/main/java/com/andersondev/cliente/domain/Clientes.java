package com.andersondev.cliente.domain;

import java.util.UUID;

import javax.validation.constraints.Email;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter

@Document(collation = "Clientes")

public class Clientes {
	
	@Id
	private UUID idCliente;
	private String nome;
	@Email
	private String email;
	@Builder.Default
	private StatusCliente status = StatusCliente.CLIENTE_POTENCIAL;
	
}
