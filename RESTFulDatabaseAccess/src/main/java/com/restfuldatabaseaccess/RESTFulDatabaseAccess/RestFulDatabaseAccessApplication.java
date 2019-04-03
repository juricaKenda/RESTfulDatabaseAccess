package com.restfuldatabaseaccess.RESTFulDatabaseAccess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.restfuldatabaseaccess")
public class RestFulDatabaseAccessApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFulDatabaseAccessApplication.class, args);
	}

}
