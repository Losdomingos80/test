package com.mobipos.springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {
	
	@GetMapping("/")
	public String index() {
		return "strona główna";
	}
	
	@GetMapping("/wiad")
	public String message() {
		return "gratulacje to działa";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
