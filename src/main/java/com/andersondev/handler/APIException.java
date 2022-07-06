package com.andersondev.handler;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Getter
@Log4j2
public class APIException extends RuntimeException{

	private HttpStatus statusException;
	private ErroApiResponse bodyException;

	public APIException(HttpStatus statusException, String message, Exception e) {
		super(message, e);
		this.statusException = statusException;
		this.bodyException = ErroApiResponse.builder()
				.message(message)
				.description(getDescription(e))
				.build();
				
	}

	private static APIException build(HttpStatus statusException, String message) {
		return new APIException(statusException, message, null); 
	}
	
	private static APIException build(HttpStatus statusException, String message, Exception e) {
		log.error("Exception: ", e);
		return new APIException(statusException, message, e); 
	}
	
	private String getDescription(Exception e) {
		return Optional.ofNullable(e)
				.map(APIException::getMessageCause).orElse(null);
	}

	private static String getMessageCause(Exception e) {
		return e.getCause() != null ? e.getCause().getMessage() : e.getMessage();
			
	}
	
	public ResponseEntity<ErroApiResponse> buildErrorResponseEntity() {
		return ResponseEntity
				.status(statusException)
				.body(bodyException);
		
	}
		
}
