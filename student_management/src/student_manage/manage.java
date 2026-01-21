package student_manage;
import java.util.Scanner;
class student{
	void student1(){
		String name = "Saran";
		int Roll_no = 119;
		char grade = 'A';
		System.out.println("NAME : " + name);
		System.out.println("Roll_no : " + Roll_no);
		System.out.println("GRADE : " + grade);
		
	}
	void student2() {
		String name = "Keeethivsan";
		int Roll_no = 072;
		char grade = 'B';
		System.out.println("NAME : " + name);
		System.out.println("Roll_no : " + Roll_no);
		System.out.println("GRADE : " + grade);
		
	}
	void student3() {
		String name = "Sameer";
		int Roll_no = 90;
		char grade = 'A';
		System.out.println("NAME : " + name);
		System.out.println("Roll_no : " + Roll_no);
		System.out.println("GRADE : " + grade);
		
	}
	void student4() {
		String name = "Rathina";
		int Roll_no = 118;
		char grade = 'A';
		System.out.println("NAME : " + name);
		System.out.println("Roll_no : " + Roll_no);
		System.out.println("GRADE : " + grade);
		
	}
	
	//void read() {}
	//void write() {}
}

class StudentManagementSystem extends student{
	void addStudent(String n,int r,char g) {
		System.out.println("NAME : " + n);
		//String n = obj.nextLine();
		System.out.println("Roll no : " + r);
		System.out.println("Grade : " + g);
		
	}
	void removeStudent() {
		System.out.println("you can leave now");
	}
	void searchStudent(String s) {
		if(s.equals("Saran")) {
			
			super.student1();
		}
		else if(s.equals("Keerthivasan")) {
			super.student2();
		}
		else if(s.equals("Sameer")) {
			super.student3();
		}
		else if(s.equals("Rathina")) {
			super.student3();
		}
	}
	
	void displayStudent() {
		super.student1();
		super.student2();
		super.student3();
		super.student4();
	}
}

public class manage {
     public static void main(String[] args) {
    	 Scanner obj = new Scanner(System.in);
    	 System.out.print("swing/javaFX : ");
    	 String a = obj.nextLine();
    	 
    	 System.out.print("Adding a new Student/Editing an existing student's information/Searching for a Student/displaying all Student/Exiting the application : ");
    	String d = obj.nextLine(); 
    	StudentManagementSystem obj1 = new StudentManagementSystem();
    	if(d.equals("Adding a new Student")){
    	  obj1.addStudent("lokesh",117,'A');
    	   
    	}
    	else if(d.equals("Searching for a Student")) {
    		System.out.print("Enter Student Name : ");
    		String s = obj.nextLine();
    		obj1.searchStudent(s);
    		
    	}
    	else if(d.equals("displaying all Student")) {
    		obj1.displayStudent();
    	}
    	
    	else if(d.equals("Exiting the application")) {
    		obj1.removeStudent();
    	}
    	 
     }
}
