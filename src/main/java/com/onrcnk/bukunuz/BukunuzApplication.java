package com.onrcnk.bukunuz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BukunuzApplication {

	public static void main(String[] args) {
		SpringApplication.run(BukunuzApplication.class, args);
	}

}
