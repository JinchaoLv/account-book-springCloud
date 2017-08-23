package com.lvjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AccountBookServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountBookServerApplication.class, args);
	}
}
