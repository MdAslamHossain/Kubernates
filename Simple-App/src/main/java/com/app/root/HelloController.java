package com.app.root;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping(value = "/{msg}")
	public String hello(@PathVariable String msg) {
		return "You typed :"+msg;
	}
}
