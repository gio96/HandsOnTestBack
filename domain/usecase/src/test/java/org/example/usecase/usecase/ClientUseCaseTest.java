package org.example.usecase.usecase;

import org.example.entities.Employee;
import org.example.gateway.ClientGateway;
import org.example.usecase.ClientUseCase;
import org.example.usecase.testdatabuilder.HourlyEmployeeTestDataBuilder;
import org.example.usecase.testdatabuilder.MontlyEmployeeTestDataBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;

@RunWith(MockitoJUnitRunner.class)
public class ClientUseCaseTest {

    @Mock
    private ClientGateway clientGateway;

    @InjectMocks
    private ClientUseCase clientUseCase;

    @Test
    public void getAllEmployeesTest() {
        //arrange
        Employee employee = new HourlyEmployeeTestDataBuilder().build();

        //act
        Mockito.when(clientGateway.getAllEmployees())
                .thenReturn(Collections.singletonList(employee));

        //assert
        Assert.assertEquals(1L, clientUseCase.getAllEmployees().size());

        Mockito.verify(clientGateway, Mockito.times(1)).getAllEmployees();
    }

    @Test
    public void getEmployeeTest() {
        //arrange
        Employee employee = new HourlyEmployeeTestDataBuilder().build();

        //act
        Mockito.when(clientGateway.getEmployee(Mockito.anyInt()))
                .thenReturn(employee);

        //assert
        Assert.assertEquals(employee, clientUseCase.getEmployee(1));

        Mockito.verify(clientGateway, Mockito.times(1)).getEmployee(Mockito.anyInt());
    }

    @Test
    public void getTotalSalaryHourlyEmployee() {
        //arrange
        Employee employee = new HourlyEmployeeTestDataBuilder().build();

        //act
        Mockito.when(clientGateway.getEmployee(Mockito.anyInt()))
                .thenReturn(employee);

        //assert
        Assert.assertEquals(new Long(14400000), clientUseCase.getEmployee(1).getTotalSalary());

        Mockito.verify(clientGateway, Mockito.times(1)).getEmployee(Mockito.anyInt());
    }

    @Test
    public void getTotalSalaryMonthlyEmployee() {
        //arrange
        Employee employee = new MontlyEmployeeTestDataBuilder().build();

        //act
        Mockito.when(clientGateway.getEmployee(Mockito.anyInt()))
                .thenReturn(employee);

        //assert
        Assert.assertEquals(new Long(600000), clientUseCase.getEmployee(2).getTotalSalary());

        Mockito.verify(clientGateway, Mockito.times(1)).getEmployee(Mockito.anyInt());
    }
}
