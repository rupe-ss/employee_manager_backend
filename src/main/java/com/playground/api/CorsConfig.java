package com.playground.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer{
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		 String[] origins = new String[] {"http://localhost:4200", "https://employee-manager-angular.web.app/", "https://employee-manager-angular.vercel.app"};
		registry.addMapping("/**")
		.allowedHeaders("*")
		.allowedMethods("GET","POST","PUT","DELETE")
		.allowedOrigins(origins);
	}
	
}
