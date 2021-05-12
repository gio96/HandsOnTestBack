package org.example.gateway;

import org.example.entities.Employee;

import java.util.List;

public interface ClientGateway {
    List<Employee> getAllEmployees();
    Employee getEmployee(Integer idEmployee);
}
