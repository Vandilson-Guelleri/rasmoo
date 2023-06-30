package com.client.api.exception.handler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.client.api.dto.error.ErrorResponseDTO;
import com.client.api.exception.BadRequestException;
import com.client.api.exception.NotFoundException;

@RestControllerAdvice
public class ResourceHandler {

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ErrorResponseDTO> notFoundException(NotFoundException n) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorResponseDTO.builder().message(n.getMessage())
				.httpStatus(HttpStatus.NOT_FOUND).statusCode(HttpStatus.NOT_FOUND.value()).build());
	}

	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<ErrorResponseDTO> badRequestException(BadRequestException b) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponseDTO.builder().message(b.getMessage())
				.httpStatus(HttpStatus.BAD_REQUEST).statusCode(HttpStatus.BAD_REQUEST.value()).build());
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponseDTO> badRequestException(MethodArgumentNotValidException m) {

		Map<String, String> messages = new HashMap<>();

		m.getBindingResult().getAllErrors().forEach(error -> {
			String field = ((FieldError) error).getField();
			String defaultMessage = error.getDefaultMessage();
			messages.put(field, defaultMessage);
		});

		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(ErrorResponseDTO.builder().message(Arrays.toString(messages.entrySet().toArray()))
						.httpStatus(HttpStatus.BAD_REQUEST).statusCode(HttpStatus.BAD_REQUEST.value()).build());
	}

	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<ErrorResponseDTO> badRequestException(DataIntegrityViolationException d) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponseDTO.builder()
				.message(d.getMessage())
				.httpStatus(HttpStatus.BAD_REQUEST)
				.statusCode(HttpStatus.BAD_REQUEST
				.value())
				.build());
	}
}
