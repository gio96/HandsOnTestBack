package org.example.config;

import org.example.gateway.ClientGateway;
import org.example.usecase.ClientUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public ClientUseCase clientUseCase(ClientGateway clientGateway) {
        return new ClientUseCase(clientGateway);
    }
}
