package org.example.usecase;

import lombok.RequiredArgsConstructor;
import org.example.entities.Employee;
import org.example.gateway.ClientGateway;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequiredArgsConstructor
public class ClientUseCase {

    private final ClientGateway clientGateway;

    public List<Employee> getAllEmployees() {
        return getAllEmployeeWithTotalSalary.apply(clientGateway)
                .collect(Collectors.toList());
    }

    public Employee getEmployee(Integer idEmployee) {
        return Optional.ofNullable(clientGateway.getEmployee(idEmployee))
                .map(employee -> {
                    employee.calculateTotalSalary();
                    return employee;
                })
                .orElse(null);
    }

    public static final Function<ClientGateway, Stream<Employee>> getAllEmployeeWithTotalSalary = clientGateway -> {
        return clientGateway.getAllEmployees()
                .stream()
                .peek(Employee::calculateTotalSalary);
    };

}
