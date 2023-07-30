import java.util.Scanner;


public class GradeCalculator {

	public static void main(String[] args) {
		

		int scoreTotal=0;
		int num=0;
		
		Scanner scanner= new Scanner (System.in);
		
		System.out.println(" Please Enter your Score- Please use negative numbers to end : ");
		
		
		while(true) {
			System.out.print("score: ");
		    int score = scanner.nextInt();
		
		    if (score <0) {
			    break;
		}
		    if (score>100) {
		    	System.out.println(" Score cannot be greater than 100:");
		    	continue;
		    }
		    
		    num++;
		    scoreTotal+=score;
		  

	}
		scanner.close();
		
		double ave= (double) scoreTotal/num;
		
		 System.out.println("Average grade: " + ave);

	        if (ave >= 90) {
	            System.out.println("Excellent work!");
	        } else if (ave >= 80) {
	            System.out.println("Good job!");
	        } else if (ave >= 70) {
	            System.out.println("Keep it up!");
	        } else {
	            System.out.println("You need to work harder.");
	        }
	    }
	}