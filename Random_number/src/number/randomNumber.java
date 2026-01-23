package number;
import java.util.Random;
import java.util.Scanner;
public class randomNumber {

	public static void main(String[] args) {
		System.out.println("Enter random number from 1 to 100 ");
		Random ran = new Random();
		Scanner obj = new Scanner(System.in);
        int randomNo = ran.nextInt(100)+1;
        int guess = 0;
        int attempt = 0;
        //int maxAttempt = 5;
        
        while(guess!=randomNo && attempt < 5) {
        	System.out.print("Enter your guess : ");
        	guess = obj.nextInt();
        	attempt++;
        	
       if(guess>randomNo) {
    	   System.out.println("Too high");
       }
       
       else if(guess<randomNo) {
    	   System.out.println("Too low");
       }
       
       
       
       else {
    	   System.out.println("Correct! you are win with "+attempt+"attempts");
       }
        }
	}

}
