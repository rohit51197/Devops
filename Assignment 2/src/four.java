import java.util.Scanner;

public class four {

	public static void main(String[] args) {
				int n;
				int index=0;
				Scanner sc  =new Scanner(System.in);
				n = sc.nextInt();
				int[] a = new int[n];
				for(int i=0;i<n;i++) {
					a[i] = sc.nextInt();
				}
				System.out.println("which index value you want to delete!?");
				index = sc.nextInt();
				
				
				// return the original array 
		        if (a == null || index < 0 || index >= a.length) {  
		        	System.out.println("Invalid input");
		        } 
		  
		        // Create another array of size one less 
		        int[] anotherArray = new int[a.length - 1]; 
		  
		        // Copy the elements except the index 
		        // from original array to the other array 
		        for (int i = 0, k = 0; i < a.length; i++) { 
		  
		            // if the index is 
		            // the removal element index 
		            if (i == index) { 
		                continue; 
		            } 
		  
		            // if the index is not 
		            // the removal element index 
		            anotherArray[k++] = a[i]; 
		        } 
		        for(int i=0;i<n-1;i++) {
					System.out.println(anotherArray[i]);
				}
	}

}
