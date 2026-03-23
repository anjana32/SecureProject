package com.project.kodnest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthController {
	
	@RequestMapping("/secure")
	@ResponseBody
	String displayResource() {
		return "WELCOME USER, UR SPRING IS SECURE";
	}

}
