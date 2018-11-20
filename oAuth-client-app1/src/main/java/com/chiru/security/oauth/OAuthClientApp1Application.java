package com.chiru.security.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class OAuthClientApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(OAuthClientApp1Application.class, args);
	}
}
