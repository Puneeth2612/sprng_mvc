package com.springmvc.first;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.first.beans.Employee;
import com.springmvc.first.beans.Student;

@Controller
public class StudentController {
	@RequestMapping("/showStudentForm")
	public String showStudentForm(Model theModel)
	{
		Student theStudent =new Student();
		
		theModel.addAttribute("student",theStudent);
		return "student-form";
		
	}
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("student") Student theStudent)
	{
	
		return "confirmation";
	}
	
	@RequestMapping("/showEmpForm")
	public String showEmpForm(Model theModel)
	{
		Employee theEmployee=new Employee();
		theModel.addAttribute("employee", theEmployee);
		return "employee";
	}
	
	@RequestMapping("/processEmployee")
	public String employeeProcess(@ModelAttribute("employee") Employee theEmp)
	{
		return "empConfirmation";
	}
	
	
	
}
