package com.springmvc.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyFirstController {
	
	@RequestMapping("/")
	
	public String showPage()
	{
		return "welcome";
	}

}
