package com.andersondev.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.log4j.Log4j2;

@RestControllerAdvice
@Log4j2
public class RestResponseEntityExceptionHandler {

	public ResponseEntity<ErroApiResponse> handlerGenericException(APIException ex){
		return ex.buildErrorResponseEntity();
	}
	public ResponseEntity<ErroApiResponse> handlerGenericException(Exception ex){
		log.error("Exception: ",ex);
		return ResponseEntity
				.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(ErroApiResponse.builder()
						.description("INTERNAL SERVER ERROR")
						.message("PLEASE INFOM THE SYSTEM ADMINISTRATOR")
						.build());
	}
}
