package com.klu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/grades")
public class ResultController {
	@GetMapping("/first/{id}")
	public String getSbiAccount(@PathVariable("id")Long id) {
		String serviceUrl="http://localhost:1001/first/result/" + id;
		RestTemplate RT=new RestTemplate();
		String response=RT.getForObject(serviceUrl, String.class);
		return response;
	}
	
	@GetMapping("/second/{id}")
	public String getIobAccount(@PathVariable("id")Long id) {
		String serviceUrl="http://localhost:1002/second/result/" + id;
		RestTemplate RT=new RestTemplate();
		String response=RT.getForObject(serviceUrl, String.class);
		return response;
	}
	
	@GetMapping("/third/{id}")
	public String getThirdAccount(@PathVariable("id")Long id) {
		String serviceUrl="http://localhost:1003/third/result/" + id;
		RestTemplate RT=new RestTemplate();
		String response=RT.getForObject(serviceUrl, String.class);
		return response;
	}
	
	@GetMapping("/fourth/{id}")
	public String getFourthAccount(@PathVariable("id")Long id) {
		String serviceUrl="http://localhost:1004/fourth/result/" + id;
		RestTemplate RT=new RestTemplate();
		String response=RT.getForObject(serviceUrl, String.class);
		return response;
	}
	
	

}
