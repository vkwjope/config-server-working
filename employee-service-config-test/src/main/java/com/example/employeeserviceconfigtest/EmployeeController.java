package com.example.employeeserviceconfigtest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class EmployeeController {

	@Value("${msg:Config Server is not working. Verify configuration properties.}")
	private String msg;

	@GetMapping("/message")
	public String getMessage() {
		return this.msg;
	}
	
	@GetMapping("/localmessage")
	public String getLocalMessage() {
		return "LocalMessage";
	}

}
