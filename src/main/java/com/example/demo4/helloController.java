package com.example.demo4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

	@GetMapping("/learning")
	public String greet() {
		
        return "This is Develop Branch !";
	}
}
