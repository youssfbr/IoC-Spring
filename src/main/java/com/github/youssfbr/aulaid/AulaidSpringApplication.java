package com.github.youssfbr.aulaid;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.youssfbr.aulaid.services.PayService;

@SpringBootApplication
public class AulaidSpringApplication implements CommandLineRunner {
		
	private final PayService payService;
		
	public AulaidSpringApplication(PayService payService) {
		this.payService = payService;
	}

	public static void main(String[] args) {
		SpringApplication.run(AulaidSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RESULTADO = " + payService.finalPrice(300.0, "SC"));		
	}

}
