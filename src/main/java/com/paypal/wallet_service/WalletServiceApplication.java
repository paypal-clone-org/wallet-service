package com.paypal.wallet_service;

import com.paypal.wallet_service.service.WalletService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class WalletServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(WalletServiceApplication.class, args);
	}
}
