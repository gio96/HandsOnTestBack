package org.example.adapter.repository;

import lombok.RequiredArgsConstructor;
import org.example.entities.Employee;
import org.example.factory.EmployeeFactory;
import org.example.gateway.ClientGateway;
import org.example.rest.ClientMasGlobal;
import org.example.rest.dto.EmployeeDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class ClientGatewayImpl implements ClientGateway {

    private final ClientMasGlobal clientMasGlobal;

    @Override
    public List<Employee> getAllEmployees() {
        return clientMasGlobal.getClientService()
                .stream()
                .map(this::convertToEmployee)
                .collect(Collectors.toList());
    }

    private Employee convertToEmployee(EmployeeDto employeeDto) {
        Employee employee = new EmployeeFactory().getEmployeeInstance(employeeDto.getContractTypeName());
        employee.setId(employeeDto.getId());
        employee.setName(employeeDto.getName());
        employee.setContractTypeName(employeeDto.getContractTypeName());
        employee.setRoleId(employeeDto.getRoleId());
        employee.setRoleName(employeeDto.getRoleName());
        employee.setRoleDescription(employeeDto.getRoleDescription());
        employee.setHourlySalary(employeeDto.getHourlySalary());
        employee.setMonthlySalary(employeeDto.getMonthlySalary());
        return employee;
    }
}
