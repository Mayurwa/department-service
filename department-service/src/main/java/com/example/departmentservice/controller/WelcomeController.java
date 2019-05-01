package com.example.departmentservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class WelcomeController {

	@Value("${app.shared.attribute}")
	private String sharedValue;
	
	
	@Value("${app.service-name}")
	private String serviceName;
	
	@GetMapping("/service")
	public String getName()
	{
		System.out.println("inside getName");
		System.out.println(serviceName);
		return "service name ["+ this.serviceName +"]";	
		
	}
	@GetMapping("/shared")
     public String getShared()
     {
		System.out.println("inside getShared");
		System.out.println(sharedValue);
		return "application name ["+ this.sharedValue +"]";	
     }
	
}
