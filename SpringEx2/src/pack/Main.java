package pack;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;


public class Main {

	public static void main(String[] args) {
    ApplicationContext bf=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
    		A a1=(A)bf.getBean("a",A.class);
    a1.setMessage(" welcome to spring core scopes");
    a1.getMessage();
    A b1 =(A)bf.getBean("a");
    b1.setMessage(" welcome to sparing");
    b1.getMessage();

	}

}
