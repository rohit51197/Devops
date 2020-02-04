package com.demo;

public class LoginService {
			public LoginPojo validateLogin(LoginPojo loginPojo) {
				//String result=null;
				LoginDao loginDao=new LoginDao();
				loginPojo = loginDao.validateUser(loginPojo); {
				
				return loginPojo;
			}
			}
}


