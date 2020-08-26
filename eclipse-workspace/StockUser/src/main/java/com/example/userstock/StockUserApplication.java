package com.example.userstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableDiscoveryClient
@SpringBootApplication
public class StockUserApplication {


	
	public static void main(String[] args) {
		SpringApplication.run(StockUserApplication.class, args);
	}

}
