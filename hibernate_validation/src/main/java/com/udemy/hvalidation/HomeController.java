package com.udemy.hvalidation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String myControllerAction()
	{
		return "main-menu";
	}
	
	
}
