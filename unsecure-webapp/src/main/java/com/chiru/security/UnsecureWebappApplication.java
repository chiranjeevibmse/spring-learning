package com.chiru.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class UnsecureWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnsecureWebappApplication.class, args);
	}
}
