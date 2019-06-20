package com.jinu.learing.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//Need controller method to show the initial HTML form
	@RequestMapping("/showform")
	public String showForm(){
		return "helloworld-form";
	}
	//Need controller method to process the HTML form
	@RequestMapping("/processForm")
    public String processData(){
    	return "helloworld";
    }
}
