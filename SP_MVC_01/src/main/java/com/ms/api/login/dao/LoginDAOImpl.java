package com.ms.api.login.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.ms.api.login.bo.UserBO;

//@Repository("loginDAO")
//@Service("loginService")
@Component
//@ComponentScan
public class LoginDAOImpl implements LoginDAO {
	private static final String query="SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD=?";
	
	//Add JdbcTemplate and Autowired
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int authenticate(UserBO bo) {
		int count=0;
		count=jt.queryForObject(query, Integer.class, bo.getUname(), bo.getUpwd());
		return count;
	}

}
