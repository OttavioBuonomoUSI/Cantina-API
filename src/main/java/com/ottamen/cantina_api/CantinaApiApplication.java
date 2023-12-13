package com.ottamen.cantina_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CantinaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CantinaApiApplication.class, args);
    }

}

