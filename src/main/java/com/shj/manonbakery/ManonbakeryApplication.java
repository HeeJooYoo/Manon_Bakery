package com.shj.manonbakery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ManonbakeryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManonbakeryApplication.class, args);
	}

}
