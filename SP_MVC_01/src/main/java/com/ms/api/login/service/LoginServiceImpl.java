package com.ms.api.login.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ms.api.login.bo.UserBO;
import com.ms.api.login.dao.LoginDAO;
import com.ms.api.login.dto.UserDTO;
//@Service("loginService")
//@Repository("loginDAO")
@Component
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO dao;

	@Override
	public String validate(UserDTO dto) {
		int count=0;
		UserBO bo=null;
		
		//convert DTO to BO
		bo=new UserBO();
		BeanUtils.copyProperties(dto, bo);
		
		//use dao
		count=dao.authenticate(bo);
		if (count==0) 
			return "Invalid Credential";
			else
		return "Valid Credential";
	}

}
