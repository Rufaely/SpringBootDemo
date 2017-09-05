package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {
	@GetMapping(value="/persons")
	public @ResponseBody Persons person(@RequestBody()Persons person) {
				
		return person;
	}
		
}
