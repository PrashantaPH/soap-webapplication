package com.webservices.restapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

	@PostMapping("/xml")
	public String demo(@RequestBody String str) {
		System.out.println(str);
		return str;
		
	}
}
