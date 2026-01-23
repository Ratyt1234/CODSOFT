package java_p;

import java.util.Scanner;

 class atm{
	
	void withdraw(int amount){
		
		if(amount <= 50000) {
			System.out.println("Your transaction is being processed");
			System.out.println("Please collect your cash");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}

	void deposit(int am) {
		if(am <= 100000) {
			//System.out.println("Press Enter");
			System.out.println("insert your cash");
			System.out.println("Enter");
		}
		else {
			System.out.println("Not enough space");
		}
	}
	void checkBalance() {
		System.out.println("check blance");
		System.out.print("Press Yes");
	}
}
 

class bankAccount extends atm{
	
	String c;
	int d;
	void bankbalance(String c,int d) {
		this.c = c;
		this.d = d;
		if(c.equals("withdraw")) {
	          super.withdraw(d);
			}
			else if(c.equals("deposit")) {
	          super.deposit(d);
			}
			else if(c.equals("balance")) {
			  super.checkBalance();
			
		
			}
	}
	
	}



 class ATM1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		bankAccount obj2 = new bankAccount();
		System.out.println("Please insert your card");
		System.out.print("Enter withdraw/deposit/balance : ");
		String a = obj.nextLine();
		System.out.print("Enter Amount : ");
	
		int b = obj.nextInt();
		
		
		obj2.bankbalance(a,b);
		
		System.out.println("please Take your card");
		
		
	}

}




