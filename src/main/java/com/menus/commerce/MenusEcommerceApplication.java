package com.menus.commerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.menus.commerce.exception.MessageResolver;

@SpringBootApplication
public class MenusEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenusEcommerceApplication.class, args);
	}

	@Bean
	public MessageResolver messageResolver() {
		return new MessageResolver();
	}

}
