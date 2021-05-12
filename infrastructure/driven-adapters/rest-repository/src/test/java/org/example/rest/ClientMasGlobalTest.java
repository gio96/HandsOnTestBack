package org.example.rest;

import org.example.rest.dto.EmployeeDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(MockitoJUnitRunner.class)
public class ClientMasGlobalTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private ClientMasGlobal clientMasGlobal;

    @Test
    public void getAllEmployeesRestTemplateTest() {
        //arrange

        //act
        Mockito.when(restTemplate.getForObject(Mockito.anyString(), Mockito.eq(EmployeeDto[].class)))
                .thenReturn(new EmployeeDto[]{});

        //assert
        Assert.assertEquals(0, clientMasGlobal.getEmployeeService().size());

        Mockito.verify(restTemplate, Mockito.times(1)).getForObject(Mockito.anyString(), Mockito.eq(EmployeeDto[].class));
    }
}
