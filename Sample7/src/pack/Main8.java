package pack;

public class Main8 {
	public static void main(String[] args)
	{
		int a=20;
		{
			System.out.println(a);
		}
		Integer b=25;
		{
			System.out.println(b);
		}
		Integer i= Integer.valueOf(a);
		System.out.println(i);
		Integer a1 = new Integer(3);
		int j=a1.intValue();
		System.out.println(i);
		int j1=a1;
		System.out.println(j1);
	}

}
