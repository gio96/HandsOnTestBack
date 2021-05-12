package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.entities.Employee;
import org.example.usecase.ClientUseCase;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/clientes", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class ClientController {

    private final ClientUseCase clientUseCase;

    @GetMapping()
    public List<Employee> getAllEmployees() {
        return clientUseCase.getAllEmployees();
    }

    @GetMapping(value = "/{idEmployee}")
    public Employee getEmployee(@PathVariable Integer idEmployee) {
        return clientUseCase.getEmployee(idEmployee);
    }
}
