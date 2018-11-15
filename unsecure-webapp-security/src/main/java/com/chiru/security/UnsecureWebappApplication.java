package com.chiru.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.chiru.security.config.SecurityConfig;

@SpringBootApplication
@EnableWebMvc
@Import(SecurityConfig.class)
public class UnsecureWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnsecureWebappApplication.class, args);
	}
}
