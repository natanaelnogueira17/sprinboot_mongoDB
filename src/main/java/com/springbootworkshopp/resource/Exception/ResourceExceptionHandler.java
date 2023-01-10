package com.springbootworkshopp.resource.Exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.springbootworkshopp.service.exception.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	public ResponseEntity<StandartError>objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandartError err =  new StandartError(System.currentTimeMillis(), status.value(), "nao encontrado", request.getRequestURI(), e.getMessage());
		return ResponseEntity.status(status).body(err);
	}

}
