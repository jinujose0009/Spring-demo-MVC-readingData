package com.jinu.learing.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
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
	//Create a controller method to read form data
	//add data to the model
	@RequestMapping("/processData")
	public String letSetModeldata(HttpServletRequest request,Model model){
		//Read the student data trom html
		String stName=request.getParameter("stuName").toUpperCase();
		String result="Welcome....."+stName;
		model.addAttribute("message", result);
		return "helloworld";
	}
	// Methode for @requestParam
	@RequestMapping("/processDataV1")
	public String letSetModeldataV1(@RequestParam("stuName") String stname,Model model){
		//Read the student data trom html
		String result="Welcome....."+stname.toUpperCase();
		model.addAttribute("message", result);
		return "helloworld";
	}
}
