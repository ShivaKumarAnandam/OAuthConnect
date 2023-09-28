package com.oauth.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "<h1>welcome to home page</h1>";
	}

	@GetMapping("/secured")
	public String secured() {
		return "<h1>welome to secured page</h1>";
	}
}
