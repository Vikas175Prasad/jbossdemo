package com.vikas.jboss;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
	return "Howdy " + name + ", have a good day";
	}
}
