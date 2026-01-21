package MARKS;
import java.util.Scanner;
class SUB{
	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter total subjects : ");
		int n = obj.nextInt();
		int[] marks = new int[n];
		for(int i = 0;i<n;i++) {
			System.out.print("Enter mark of "+(i+1)+" subject :");
			marks[i] = obj.nextInt();
		}
		
		int Total = marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
		
		System.out.println("Total marks : " + Total);
		
		int Average_mark = Total/n ;
		
		System.out.println("Average mark :"+Average_mark);
		

		if(Average_mark==100) {
			System.out.println("Grade A");
		}
		else if(Average_mark >= 90) {
			System.out.println("Grade B");
		}
		else if(Average_mark >= 80) {
			System.out.println("Grade C");
		}
		else if(Average_mark >= 70) {
			System.out.println("Grade E");
		}
		else {
			System.out.println("Fail");
		}
		
	}
}



