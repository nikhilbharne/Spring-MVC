package com.ms.api.login.service;

import com.ms.api.login.dto.UserDTO;

public interface LoginService {
	public String validate(UserDTO dto);

}
