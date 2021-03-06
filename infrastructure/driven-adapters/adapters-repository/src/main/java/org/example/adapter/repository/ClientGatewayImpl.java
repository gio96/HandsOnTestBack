package org.example.adapter.repository;

import lombok.RequiredArgsConstructor;
import org.example.entities.Employee;
import org.example.entities.EmployeeMonthly;
import org.example.factory.EmployeeFactory;
import org.example.gateway.ClientGateway;
import org.example.rest.ClientMasGlobal;
import org.example.rest.dto.EmployeeDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
@RequiredArgsConstructor
public class ClientGatewayImpl implements ClientGateway {


    private final ClientMasGlobal clientMasGlobal;

    @Override
    public List<Employee> getAllEmployees() {
        return getAllEmployeeRest()
                .collect(Collectors.toList());
    }

    @Override
    public Employee getEmployee(Integer idEmployee) {
        return getAllEmployeeRest()
                .filter(employee -> employee.getId().equals(idEmployee))
                .findAny()
                .orElse(buildEmployeeEmpty());
    }

    private Employee convertToEmployee(EmployeeDto employeeDto) {
        Employee employee = new EmployeeFactory().getEmployeeInstance(employeeDto.getContractTypeName());
        employee.setId(employeeDto.getId());
        employee.setName(employeeDto.getName());
        employee.setContractTypeName(employeeDto.getContractTypeName());
        employee.setRoleId(employeeDto.getRoleId());
        employee.setRoleName(employeeDto.getRoleName());
        employee.setRoleDescription(employeeDto.getRoleDescription());
        employee.setHourlySalary(valueExist.apply(employeeDto.getHourlySalary()));
        employee.setMonthlySalary(valueExist.apply(employeeDto.getMonthlySalary()));
        return employee;
    }

    private Employee buildEmployeeEmpty() {
        Employee employeeEmpty = new EmployeeMonthly();
        employeeEmpty.setId(null);
        employeeEmpty.setName(null);
        employeeEmpty.setContractTypeName(null);
        employeeEmpty.setRoleId(null);
        employeeEmpty.setRoleName(null);
        employeeEmpty.setRoleDescription(null);
        employeeEmpty.setHourlySalary(0L);
        employeeEmpty.setMonthlySalary(0L);
        return employeeEmpty;
    }

    private Stream<Employee> getAllEmployeeRest() {
        return clientMasGlobal.getEmployeeService()
                .stream()
                .map(this::convertToEmployee);
    }

    private static final UnaryOperator<Long> valueExist = value -> {
        if (Objects.isNull(value)) {
            return 0L;
        }
        return value;
    };


}
