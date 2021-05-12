package org.example.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.Employee;
import org.example.entities.EmployeeMonthly;
import org.example.usecase.ClientUseCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Collections;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
////@SpringBootConfiguration
//@SpringBootTest
//@RestClientTest
//@RunWith(SpringRunner.class)
//@WebMvcTest(ClientController.class)
public class ClientControllerTest {

    /*@Autowired
    private MockMvc mockMvc;

    //@Autowired
    //private ObjectMapper objectMapper;

    @Test
    public void validarEstructura() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/clientes")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
               .andExpect(MockMvcResultMatchers.jsonPath("$[*].id").value(1));
    }*/

    @Test
    public void validarEstructura(){}


    /*@Autowired
    private MockMvc mockMvc;

    @MockBean
    private ClientUseCase clientUseCase;

    @Test
    public void validarEstructura() throws Exception {
        Employee employee = new EmployeeMonthly();
        employee.setId(1);

        Mockito.when(clientUseCase.getAllEmployees()).thenReturn(Collections.singletonList(employee));

        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/clientes")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].id").value(1));
    }*/
}
