package com.Nil.CacheControllerWIthSAML;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CacheControllerWIthSamlApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheControllerWIthSamlApplication.class, args);
	}
}
