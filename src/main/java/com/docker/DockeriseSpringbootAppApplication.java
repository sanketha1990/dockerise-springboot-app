package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockeriseSpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockeriseSpringbootAppApplication.class, args);
	}

	@GetMapping("/message")
	public String dockerizing() {
		return "Welcome to code pipeline AWS service";
	}

}
