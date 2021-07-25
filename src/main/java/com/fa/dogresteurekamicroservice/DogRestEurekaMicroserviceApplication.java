package com.fa.dogresteurekamicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DogRestEurekaMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogRestEurekaMicroserviceApplication.class, args);
	}

}
