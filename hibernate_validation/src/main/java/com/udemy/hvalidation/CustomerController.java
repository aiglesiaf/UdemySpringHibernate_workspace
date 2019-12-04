package com.udemy.hvalidation;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {


	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processModelForm")
	public String processForm(@Valid @ModelAttribute Customer customer, BindingResult bindingResult)
	{
		
		if(bindingResult.hasErrors())
		{
			return "customer-form";
		} else
		{
			System.out.println(customer.getFirstName()+" "+customer.getLastName());
			return "show-form";
		}		
	}	
}

