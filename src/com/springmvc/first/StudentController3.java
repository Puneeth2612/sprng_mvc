package com.springmvc.first;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.first.beans.Student;

@Controller
public class StudentController3 {

@RequestMapping("/showForm34")	
public String showStudentForm3(Model theModel)
{
	Student theStudent=new Student();
	theModel.addAttribute("student", theStudent);
	
	return "student-form";
}
@RequestMapping("/showEmpForm1")	
public String showStudentForm4()
{

	
	return "buddy";
}

@RequestMapping("/processform34")
public String processStudentForm3(@ModelAttribute ("student") Student theStudent)
{
	return "confirmation";
}

}
