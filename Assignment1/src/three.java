import java.util.Scanner;

public class three {

    //main method
    public static void main(String[] args) {
        //variable
        int choices;
        int song;
        int song2;
        int song4;
        int count=0;
        
        boolean s;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("do you want to play the quiz!? type true or false");
        s = scan.nextBoolean();
        
        if(s) {
        	//scanner for input options
            
            System.out.println("Q1) What is the capital of India?");

            //choose singer from these 4 options
            System.out.println("1) Delhi\r\n" + 
            		"2) Mumbai\r\n" + 
            		"3) Chennai\r\n" + 
            		"");
            song = scan.nextInt();


            if (song == 1) {
                //if select wrong options
                System.out.println("Congrate you answer is correct");
                song++;
                count++;
            }
            else{
            	System.out.println("Your answer is incorrect. Delhi is the right answer .");
            }
            
            //Q2
            System.out.println("Q2) Can you store the value \"dog\" in a variable of type int?");

            //choose singer from these 4 options
            System.out.println("1) yes\r\n" + 
            		"2) no\r\n" + 
            		"");
            song2 = scan.nextInt();

            if (song2 == 2) {
            	System.out.println("Congrate you answer is correct ");
                song2++;
                count++;
            }
            else{
            	System.out.println("Your answer is incorrect. No is the right answer.");
            }  
            
            //Q3
            System.out.println("Q3) What is the result of 9+9/3?");
            System.out.println("1) 5\r\n" + 
            		"2) 12\r\n" + 
            		"3) 15/3\r\n" + 
            		"");
            song4 = scan.nextInt();


            if (song4 == 2) {
            	System.out.println("Congrate you answer is correct");
                song4++;
                count++;
            }
            else{
            	System.out.println("Your answer is incorrect. 12 is the right answer.");
            }
            System.out.println(count +"out of 3");
        }
        else {
        	System.out.println("Bye bye");
        }
        
    }
}