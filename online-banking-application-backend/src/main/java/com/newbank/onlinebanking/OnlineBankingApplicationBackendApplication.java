package com.newbank.onlinebanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class OnlineBankingApplicationBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBankingApplicationBackendApplication.class, args);
	}

}
