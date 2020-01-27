import java.util.Scanner;

public class two {

	public static void main(String[] args) {

		 String name = null;
		 String year = null;
		 Scanner sc= new Scanner(System.in);
		 //String patt = "(?<!\\S)\\p{Alpha}+(?!\\S)";
		 
			while(true)
			{
				int nflag=0;
				int yflag=0;
				
				
				year=sc.next();
				name =sc.next();
				
				
				if(year.matches("[0-9]+"))
				 {
					yflag = 0;
				 }
				else {
					System.out.println("invalid year");
					yflag = 1;
				}
				
				
				 
				 for (int i = 0; i < name.length(); i++) {
						if (!name.matches("[0-9]+")) {
							
						}
						else {
							nflag=1;
							System.out.println("invalid name");
							break;
						}
				 }
				 
				 if(nflag==0 && yflag==0) {
					 break;
				 }
				 
			}
			// System.out.println("invalid input");	
			
			System.out.println(year + " " + name);
		 
	     
	}

}
