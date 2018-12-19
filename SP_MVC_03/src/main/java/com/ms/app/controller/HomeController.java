package com.ms.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ms.app.service.AppService;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("Home Controller Constructor");
	}

	@Autowired(required = true)
	private AppService service;

	@GetMapping("/home")
	public void homeDisplay(Map<String, Object> map) {
		String msg = null;
		// use Service
		msg = service.homeMsg();
		// prepare Model Object
		map.put("msg", msg);
		//return "home";
	}
	
	/*@GetMapping("/home")
	public void homeDisplay(Model model) {
		String hmsg = null;
		// use Service
		hmsg = service.homeMsg();
		// prepare Model Object
		model.addAttribute("msg",hmsg);
		//return "home";
	}*/

	@GetMapping("/dashbord")
	public void dashbordDisplay(Map<String, Object> map) {
		String dmsg = null;
		// Use service
		dmsg = service.dashMsg();
		// prepare Model Object
		map.put("msg", dmsg);
		//return "dashbord";
	}

}
