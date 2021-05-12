package org.example.rest;

import lombok.RequiredArgsConstructor;
import org.example.rest.dto.EmployeeDto;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class ClientMasGlobal {

    private final static String URLMASGLOBAL = "http://masglobaltestapi.azurewebsites.net/api/employees";

    private final RestTemplate restTemplate;

    public List<EmployeeDto> getEmployeeService(){
        return Arrays.stream(Objects.requireNonNull(restTemplate.getForObject(URLMASGLOBAL, EmployeeDto[].class)))
                .collect(Collectors.toList());
    }
}
