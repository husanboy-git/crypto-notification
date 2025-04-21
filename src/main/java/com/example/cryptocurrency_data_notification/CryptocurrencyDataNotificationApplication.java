package com.example.cryptocurrency_data_notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CryptocurrencyDataNotificationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CryptocurrencyDataNotificationApplication.class, args);
		SpringApplication.exit(run);
	}

}
