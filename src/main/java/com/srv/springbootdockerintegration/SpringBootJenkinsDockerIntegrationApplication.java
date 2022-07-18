package com.srv.springbootdockerintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootJenkinsDockerIntegrationApplication {
	@GetMapping("/test")
	public String getMessage() {
		return "demo jenkins";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsDockerIntegrationApplication.class, args);
		System.out.println("hello");
		System.out.println("jenkins");
	}

}
