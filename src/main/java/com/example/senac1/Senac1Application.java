package com.example.senac1;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "testando", version = "2.0", description = "Teste"))
public class Senac1Application {

    public static void main(String[] args) {
        SpringApplication.run(Senac1Application.class, args);
    }

}
