package myBank;
import java.util.*;

public class Account {
	public double balance;
	
	public Account(double balance) {
		this.balance = balance;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Welcome to Alves' Bank");
		
		//register
		System.out.println("I noticed that is your first time here. Let's to do a register?");
		
		System.out.println("Tell us your name: ");
		String name = input.next();
		System.out.println("Enter a username for you account: ");
		String username = input.next();
		System.out.println("Enter a password for you account (Between 4 and 6 numbers): ");
		int password = input.nextInt();
		System.out.println("Enter your register, it's can be you CPF: ");
		long register = input.nextLong();
		System.out.println("Enter your phone to contact (Only numbers): ");
		long phone = input.nextLong();
		
		System.out.println("Register realized with success! Welcome " + name + "to our agency!");
		
		int opt = 1;
		do {
			System.out.println("Select an option of operation to your account:");
			System.out.println("(1) - Consult sald \n(2) - Plunder \n(3) - Deposit \n(4) - Exit");
			int option = input.nextInt();
		//operations 
			switch(option) {
				case 1:
					System.out.println("Your actual balance is U$ " + balance + " you need to puting some value to movement your account. ");
					break;
				case 2: 
					System.out.println("Enter a value you want to plunding of your account: ");
					double plunderValue = input.nextDouble();
					plunder(plunderValue);
					break;
				case 3:
					System.out.println("Enter the value you want to depositing in your account: ");
					double depositValue = input.nextDouble();
					deposit(depositValue);
					break;
				case 4:
					opt = 0;
					System.out.println("end");
				break;
			}
		} while(opt != 0);
	}
	
	//operations methods
	public void plunder(double value) {
		if (value >  balance) {
			System.out.println("Balance insufficient ");
		} else {
			balance -= value;
			System.out.println("Transation realized with success! \n Your new balance is: " + balance);
		}
	}
	public void deposit(double value) {
		balance += value;
		System.out.println("Transation realized with success! \n Your new balance is: " + balance);
	}
}

