package com.example.backendexcelservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BackendExcelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendExcelServiceApplication.class, args);
	}

}
