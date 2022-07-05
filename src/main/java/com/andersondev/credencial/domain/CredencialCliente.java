package com.andersondev.credencial.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Document(collection = "CredencialCliente")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CredencialCliente {

	@MongoId(targetType = FieldType.STRING)
	@Getter
	private String usuario;
	private String senha;
	
	public CredencialCliente(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = new BCryptPasswordEncoder().encode(senha);
	}
		
	public String getSenha() {
		return this.senha;
	}
	
}
