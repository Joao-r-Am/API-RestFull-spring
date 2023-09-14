package com.example.apispringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com/example/apispringboot/models")
@SpringBootApplication
public class ApiSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringbootApplication.class, args);
	}

}
