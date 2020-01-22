
public class Employee {
 int eid;
 String ename;
 int age;
 float salary;
 float annualsal;
 
 public void getDetails()
 {
	 eid=101;
	 ename="rohit";
	 age=32;
	 salary=1.0f;
 }
 public void dispDetails()
 {
	System.out.println("Name:"+ename);
	System.out.println("Annual Salary"+annualsal);
 }
 public void calSal()
 {
	 annualsal=salary*12;
 }
 
 }

