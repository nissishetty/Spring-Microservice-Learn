package com.niswarth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringMicroserviceMovieCatalogApplication {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviceMovieCatalogApplication.class, args);
	}

}
