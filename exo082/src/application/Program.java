package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = scan.nextInt();
		System.out.print("Enter  account holder: ");
		scan.nextLine();
		String holder = scan.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char response = scan.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = scan.nextDouble();
			account = new Account(number, holder, initialDeposit);
					
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data : ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter deposit value: ");
		double depositValue = scan.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter withdraw value: ");
		double withdrawValue = scan.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		
		
		
		scan.close();
		
		
		

	}

}
