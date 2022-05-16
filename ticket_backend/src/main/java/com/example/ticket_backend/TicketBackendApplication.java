package com.example.ticket_backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ticket_backend.mapper")
public class TicketBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBackendApplication.class, args);
	}

}
