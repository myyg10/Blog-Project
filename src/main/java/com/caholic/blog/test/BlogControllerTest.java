package com.caholic.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogControllerTest {

	@GetMapping
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
