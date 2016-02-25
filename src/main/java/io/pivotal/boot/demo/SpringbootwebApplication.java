package io.pivotal.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootwebApplication extends SpringBootServletInitializer {

	
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		//To make the compiled result run in Tomcat
		return application.sources(SpringbootwebApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwebApplication.class, args);
	}
}
