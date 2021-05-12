package org.example.usecase;

import lombok.RequiredArgsConstructor;
import org.example.entities.Employee;
import org.example.gateway.ClientGateway;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequiredArgsConstructor
public class ClientUseCase {

    private final ClientGateway clientGateway;

    public List<Employee> getAllEmployee() {
        return getAllEmployeeWithTotalSalary.apply(clientGateway)
                .collect(Collectors.toList());
    }

    public Employee getEmployee(Integer idEmployee) {
        return getAllEmployeeWithTotalSalary.apply(clientGateway)
                .filter(employee -> employee.getId().equals(idEmployee))
                .findAny()
                .orElse(null);
    }

    public static final Function<ClientGateway, Stream<Employee>> getAllEmployeeWithTotalSalary = clientGateway -> {
        return clientGateway.getAllEmployees()
                .stream()
                .peek(Employee::calculateTotalSalary);
    };
}
