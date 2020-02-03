package com.demo;

public class LoginService {
			public String validateLogin(String username,String password) {
				String result=null;
				LoginDao loginDao=new LoginDao();
				if(loginDao.validateUser(username, password))
				{
				result="success";
				}
				else
				result="failure" ;
				return result;
			}
}

