package com.udemy.springmvc.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	
	@RequestMapping("showForm")
	public String showForm()
	{
		return "input-form";
	}
	
	
	@RequestMapping("processModelForm")
	public String receiveModelForm(HttpServletRequest request, @RequestParam String surname, Model model)
	{
		
		model.addAttribute("myString", "Hey ho!!!");
		return "show-form";
	}
	
	@RequestMapping("processForm")
	public String processForm()
	{
		return "show-form";
	}
	
}
