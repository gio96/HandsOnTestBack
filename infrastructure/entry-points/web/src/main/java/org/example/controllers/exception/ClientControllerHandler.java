package org.example.controllers.exception;

import org.example.usecase.exceptions.ClientException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class ClientControllerHandler {

    @ExceptionHandler(ClientException.class)
    public ResponseEntity<Object> clientesException(ClientException exception) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("message", exception.getMessage());

        return new ResponseEntity<>(body, HttpStatus.resolve(exception.getType().getStatus()));
    }
}
