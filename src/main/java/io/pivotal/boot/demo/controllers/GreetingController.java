package io.pivotal.boot.demo.controllers;

import io.pivotal.boot.demo.domain.Greeting;

import java.util.concurrent.atomic.AtomicLong;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public Greeting greeting(
			@RequestParam(value = "name", defaultValue = "World") String name) {
		
//		if(null!=sname)
//		{
//			name=sname;
//		}
		return new Greeting(counter.incrementAndGet(), String.format(template,
				name));
	}
//	
//	@Value("${name}")
//	private String sname;
}
