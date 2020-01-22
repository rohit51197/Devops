class A
{
	void methodA()
	{
		System.out.println("Class A");
	}
}
	

class B extends A
{
	void methodB()
	{
		System.out.println("Class B");
	}
}
		
 

public class Main {

	public static void main(String[] args) {
		B b1=new B();
		b1.methodA();
		b1.methodB();
    
	}

}
