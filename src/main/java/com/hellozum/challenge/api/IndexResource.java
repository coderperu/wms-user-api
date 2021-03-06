package com.hellozum.challenge.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class IndexResource {
	
	@Value("${application.description: Prueba tecnica - spring boot - java 11}")
	private String description;
	
	@RequestMapping()
	public String index() {
		return description;
	}
}
