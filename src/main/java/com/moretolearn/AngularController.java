package com.moretolearn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AngularController {

	@GetMapping("/")
	public String initAngular() {
		return "index.html";
	}
}
