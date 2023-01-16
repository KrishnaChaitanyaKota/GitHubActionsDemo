package com.githubActions.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubActionsDemo {
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Hello KC! $$";
	}

}
