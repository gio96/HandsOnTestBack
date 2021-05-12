package org.example.adapters;

import org.example.adapter.repository.ClientGatewayImpl;
import org.example.entities.ContractType;
import org.example.rest.ClientMasGlobal;
import org.example.rest.dto.EmployeeDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;

@RunWith(MockitoJUnitRunner.class)
public class ClienteGatewayImplTest {

    @Mock
    private ClientMasGlobal clientMasGlobal;

    @InjectMocks
    private ClientGatewayImpl clientGatewayImpl;

    @Test
    public void getAllEmployeesServiceTest() {
        //arrange
        EmployeeDto employeeDto = EmployeeDto.builder().id(1)
                .contractTypeName(ContractType.HourlySalaryEmployee)
                .hourlySalary(10000L)
                .monthlySalary(50000L)
                .build();

        //act
        Mockito.when(clientMasGlobal.getEmployeeService())
                .thenReturn(Collections.singletonList(employeeDto));

        //assert
        Assert.assertEquals(0L, clientGatewayImpl.getAllEmployees().size());

        Mockito.verify(clientMasGlobal, Mockito.times(1)).getEmployeeService();
    }

    @Test
    public void getEmployeesServiceWithHourlySalaryNullTest() {
        //arrange
        EmployeeDto employeeDto = EmployeeDto.builder().id(1)
                .contractTypeName(ContractType.HourlySalaryEmployee)
                .monthlySalary(50000L)
                .build();

        //act
        Mockito.when(clientMasGlobal.getEmployeeService())
                .thenReturn(Collections.singletonList(employeeDto));

        //assert
        Assert.assertEquals(new Long(0L), clientGatewayImpl.getAllEmployees().get(0).getHourlySalary());

        Mockito.verify(clientMasGlobal, Mockito.times(1)).getEmployeeService();
    }

    @Test
    public void getEmployeesServiceWithMonthlySalaryNullTest() {
        //arrange
        EmployeeDto employeeDto = EmployeeDto.builder().id(1)
                .contractTypeName(ContractType.HourlySalaryEmployee)
                .hourlySalary(50000L)
                .build();

        //act
        Mockito.when(clientMasGlobal.getEmployeeService())
                .thenReturn(Collections.singletonList(employeeDto));

        //assert
        Assert.assertEquals(new Long(0L), clientGatewayImpl.getAllEmployees().get(0).getMonthlySalary());

        Mockito.verify(clientMasGlobal, Mockito.times(1)).getEmployeeService();
    }
}
