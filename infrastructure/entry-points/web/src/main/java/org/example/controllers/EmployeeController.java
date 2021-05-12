package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.entities.Employee;
import org.example.usecase.ClientUseCase;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/clientes", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class EmployeeController {

    private final ClientUseCase clientUseCase;

    @CrossOrigin(origins = "*")
    @GetMapping()
    public List<Employee> getAllEmployees() {
        return clientUseCase.getAllEmployees();
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/{idEmployee}")
    public Employee getEmployee(@PathVariable Integer idEmployee) {
        return clientUseCase.getEmployee(idEmployee);
    }
}
