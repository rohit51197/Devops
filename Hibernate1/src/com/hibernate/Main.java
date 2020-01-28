package com.hibernate;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction t= session.beginTransaction();
        
        String sql="DELETE FROM Student1 WHERE id=1";
        		Query query = session.createQuery(sql);
        Student1 s=null;
        int row= query.executeUpdate();
        if(row ==0)
        	System.out.println("Doesnt deleted any row");
        else
        	System.out.println("Deleted Row:"+row);
       
        
        s=(Student1)session.get(Student1.class,1);
        
        s.setName("Roh");
        session.update(s);
        t.commit();
        System.out.println("updated");
        

	}

}
