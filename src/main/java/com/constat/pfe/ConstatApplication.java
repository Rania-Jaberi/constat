package com.constat.pfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.constat.pfe.controller.TestConstatController;

@SpringBootApplication
@ComponentScan(basePackageClasses  = { TestConstatController.class })
public class ConstatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstatApplication.class, args);
	}

}
