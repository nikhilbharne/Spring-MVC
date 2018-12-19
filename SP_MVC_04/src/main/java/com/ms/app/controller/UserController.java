package com.ms.app.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ms.app.model.User;
@Controller
//@RequestMapping("/user")
public class UserController {

	public UserController() {
		System.out.println("User Controller constructor");
	}
	@GetMapping("/display")
	public String displayForm(Map<String, Object>map) {
		User user=new User();
		map.put("user", user);
		return "userForm";
	}
	@PostMapping("/regUser")
	public String processForm(Map<String, Object>map,@ModelAttribute("user") User user) {
		System.out.println(user);
		map.put("user", user);
		return "sucess";
	}

}
