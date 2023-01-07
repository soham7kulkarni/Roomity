package com.roomity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class CrossOriginConfig {

	public void addCorsMapping(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("*");
	}
}
