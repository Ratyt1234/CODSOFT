package MONEY;
import java.util.Scanner;
public class Money {
       public static void main(String[] args) {
    	   Scanner obj = new Scanner(System.in);
    	   System.out.print("Enter a base currency : ");
    	   String base = obj.nextLine();
    	   System.out.print("Enter a Target currency : ");
    	   String Target = obj.nextLine();
    	   
    	   
    	   double rate = 0;
    	   if(base.equals("INR") && Target.equals("USD")) {
    		   rate = 13.5;
    	   }
    	   
    	   else if(base.equals("THINAR") && Target.equals("RUPEES")) {
    		   rate= 250;
    	   }
    	   
    	   else if(base.equals("EUR") && Target.equals("USD")) {
    		   rate = 0.33 ;
    	   }
    	   else {
    		   System.out.println("Not possible to convert currency");
    	   }
    	   System.out.print("Enter a Amount : ");
    	   double Amount = obj.nextDouble();
    	   
    	   double result = rate * Amount ;
    	   System.out.print("Converted currency : "+result+" "+Target);
       }
}
