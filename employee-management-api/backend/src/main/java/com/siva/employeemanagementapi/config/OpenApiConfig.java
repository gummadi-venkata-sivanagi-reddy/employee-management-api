package com.siva.employeemanagementapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Employee Management API")
                        .version("1.0")
                        .description("Professional API documentation for Siva's Employee Management System")
                        .contact(new Contact()
                                .name("Siva Reddy")
                                .email("siva61113@gmail.com")));
    }
}