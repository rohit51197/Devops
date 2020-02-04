package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDao {

public LoginPojo validateUser(LoginPojo p) {
//boolean st =false;
try {
Class.forName("com.mysql.jdbc.Driver");
//System.out.println("Driver loaded");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/roh_db","root", "");  
Statement st = con.createStatement();
String query = "select * from emp where username ='" + p.getUsername() + "' and password = '" + p.getPassword() + "'";
ResultSet rs = st.executeQuery(query);

while(rs.next())  {
//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  ");
if(rs.getString(1).equals(p.getUsername()) && rs.getString(2).equals(p.getPassword()) ) {
p.setRole(rs.getString(3));
con.close();
return p;
}
}


} catch (Exception e) {
// TODO Auto-generated catch block
System.out.println(e.getMessage());
}
return p;
}
}