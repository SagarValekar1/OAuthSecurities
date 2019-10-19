package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class OAuthSecuritiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuthSecuritiesApplication.class, args);
	}

}
