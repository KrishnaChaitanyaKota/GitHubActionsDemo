package com.githubActions.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubActionsDemo {
	
	@Value("${sever.port}")
	private int port;
	
	@GetMapping("/hello")
	public String getMessage() {
		System.out.println(port);
		return "Hello KC! $$";
	}

}
