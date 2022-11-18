package com.jimg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.tryingsboot.controller"})
@ComponentScan("com.navajna.controller")
@ComponentScan("com.jimg.Democontroller")
public class PaginaMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginaMvcApplication.class, args);
	}

}
