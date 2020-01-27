import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		int n;
		int temp=0;
		int index=0;
		
		Scanner sc  =new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("At which index value you want to insert!?");
		index = sc.nextInt();
		
		
		// return the original array 
        if ( index < 0 || index >= a.length) {  
        	System.out.println("Invalid input");
        }
        if(a == null) {
        	a[0] = sc.nextInt();
        }
  
        // Create another array of size one less 
        int[] anotherArray = new int[a.length + 1]; 
  
        // Copy the elements except the index 
        // from original array to the other array 
        for (int i = 0, k = 0; i < a.length; i++) { 
  
            // if the index is 
            // the removal element index 
            if (i == index) { 
                temp = a[i];
                anotherArray[k++] = sc.nextInt();
                anotherArray[k++] = temp;
            	//continue; 
            } 
            else {
            	anotherArray[k++] = a[i];
            }
            // if the index is not 
            // the removal element index 
             
        } 
        for(int i=0;i<n+1;i++) {
			System.out.println(anotherArray[i]);
		}
	}

}
