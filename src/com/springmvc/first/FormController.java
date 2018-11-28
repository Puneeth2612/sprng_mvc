package com.springmvc.first;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping("/form")
	public String firstForm() {
		return "showform";
	}

	@RequestMapping("/processform")
	public String processForm() {
		return "processform";
	}

	@RequestMapping("/processform2")
	public String processForm2(HttpServletRequest request, Model model) {

		String message = request.getParameter("name");

		model.addAttribute("message", message);
		return "processform";

	}
	@RequestMapping("/processform3")
	public String processForm3(@RequestParam("name") String name, Model model) {

		

		model.addAttribute("message", name);
		return "processform";

	}
	@RequestMapping("/processform345")
	public String processForm345(@RequestParam("name") String name, Model model) {

		

		model.addAttribute("message", name);
		return "welcome";

	}
}
