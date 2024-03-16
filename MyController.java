package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.greatlearning.model.Student;

@Controller
public class MyController {

	
//	public String greet(Model model)
//	{						//key,Value
//		model.addAttribute("myking","Virak Kohli");
//		return "virat";   //view name
//	}
	
	@RequestMapping("/")
	public String greet(Model model)
	{						
		return "virat";   //view name
	}
	
	
	
//	public String greet(ModelMap modelmap)
//	{						//key,Value
//		modelmap.addAttribute("cricketer","Virat Kohli");
//		modelmap.addAttribute("actor","Shah Rukh Khan");
//		modelmap.addAttribute("businessman","Mukesh Ambani");
//		return "virat";   //view name
//	}
	
//	@RequestMapping("/")
//	public ModelAndView greet()
//	{						
//		ModelAndView mav=new ModelAndView("virat");
//		mav.addObject("cricketer","Rohit Sharma");
//		mav.addObject("actor","Deepika Padukone");
//		mav.addObject("businessman","Ratan Tata");
//		return mav;   //view name
//	}
	
//	@RequestMapping("/")
//	public ModelAndView greet1()
//	{						
//		ModelAndView mav=new ModelAndView();
//		mav.setViewName("virat");
//		mav.addObject("cricketer","Rohit Sharma");
//		mav.addObject("actor","Deepika Padukone");
//		mav.addObject("businessman","Ratan Tata");
//		return mav;   //view name
//	}
	
	@RequestMapping("/march")
	public String mumbaiIndians()
	{
		return "rohit";   //view name
	}
	
	
	@RequestMapping(value={"/Mahendra","/singh","/dhoni"})
	public String chennaiSuperKings()
	{
		return "csk";   //view name
	}
	
	@RequestMapping("/register")
	public String studentRegistration(Model model)
	{
		Student s1=new Student();
		model.addAttribute("emptyStudentObject",s1);
		return "registration-form";
	}
	
	@RequestMapping("/saveStudentDetails")
	public String saveStudentDetails(@ModelAttribute("filledStudentObject") Student s2)
	{
		return "display-registration-details";
	}
	
}
