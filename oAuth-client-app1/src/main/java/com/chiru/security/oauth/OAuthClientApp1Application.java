package com.chiru.security.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class OAuthClientApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(OAuthClientApp1Application.class, args);
	}
}
