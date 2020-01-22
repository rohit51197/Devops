package pack;
import java.util.*;

public class Student {
private int sid;
private String sname;
private List Mobile;


public void display()
{
	System.out.println("Sid:"+this.sid+"\n"+"Sname:"+this.sname+" "+"\n");
	Iterator i=Mobile.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
public Student(int sid, String sname, List<String>mobile) {
		
	//super();
	this.sid = sid;
	this.sname = sname;
	Mobile = mobile;
}
}
