package com.ms.api.login.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ms.api.login.command.UserCommand;
import com.ms.api.login.dto.UserDTO;
import com.ms.api.login.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService service;
	
	
	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public String showForm(@ModelAttribute("userCmd") UserCommand cmd){
		return "login_form";
	}
	
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public String processForm(Map<String,String>map,@ModelAttribute("userCmd")UserCommand cmd,BindingResult errors ) {
		UserDTO dto=null;
		String result=null;
		//convert command obj to dto
		dto=new UserDTO();
		//copy  BeanUtill
		BeanUtils.copyProperties(cmd, dto);
		
		//use service method
		result=service.validate(dto);
		map.put("result", result);
		return "login_form";
		
	}
	


}
