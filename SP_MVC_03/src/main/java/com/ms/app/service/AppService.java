package com.ms.app.service;

import org.springframework.stereotype.Service;

@Service(value="service")
public class AppService {

	public AppService() {
		System.out.println("App-Service Constructor");
	}
	
	public String homeMsg() {
		return "Welcome To The Home Page";
	}
	
	public String dashMsg() {
		return "Welcome to Dash Board Page Under Construction";
	}

}
