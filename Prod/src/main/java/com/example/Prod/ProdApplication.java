package com.example.Prod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ProdApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProdApplication.class, args);
	}

}
