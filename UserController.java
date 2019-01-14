package com.vehicle.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vehicle.model.User;
import com.vehicle.service.IUserService;


@Controller
public class UserController {

@Autowired
IUserService userService;

	@RequestMapping("/vehicles")
	public String showLoginView(Model modal)
	{
		modal.addAttribute("user", new User());
		String view="LoginView";
		return view;
	}
	
	@RequestMapping(value="/LoginVerification",method=RequestMethod.POST)
	public String LoginValidation(Model model,HttpServletRequest req)
	{
		String userName=req.getParameter("userName");
		String password=req.getParameter("password");
		
		System.out.println("this is password"+password);
		if(userService.verifyUser(userName, password))
		{
		return "successPage";
		}
		return "FailurePage";

	}
	
	
	@RequestMapping(value="/registerPage",method=RequestMethod.POST)
	public String validateregistrationPage(@Valid @ModelAttribute("user") 
	User user ,BindingResult bindingResult,Model model,HttpServletRequest req)
	{
		
		String view="";
	if(bindingResult.hasErrors())
	{
		view="successPage";
		return view;
	}
	else
	{
		String userName=req.getParameter("userName");
		String password=req.getParameter("password");
	
	/*	System.out.println(username);
		System.out.println(password);
System.out.println(user);*/
		userService.AddUser(user);
		
		view="successPage";
		return view;
		
	}
	}
	
	@RequestMapping("/Forgot")
	public String showForgetPassword(Model model,HttpServletRequest request)
	{
	//	model.addAttribute("usermail", new AuthorizationDetails());
		String view="ForgetPassword";
	
		return view;
	}
	
	
	@RequestMapping(value="/ForgotProcessing",method=RequestMethod.POST)
public void  ProcessPassword(HttpServletRequest req)
{
	
		String email=req.getParameter("userName");
		System.out.println(email);
		List UserDetails=userService.fetchPassword(email);
		System.out.println(UserDetails.get(1));
		//String view="success";
				
				
}
}

