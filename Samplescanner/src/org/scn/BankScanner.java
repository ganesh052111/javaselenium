package org.scn;

import java.util.Scanner;

public class BankScanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Branch Name");
		String branchName = s.nextLine();
		 
		System.out.println("Bank Name");
		String bankName = s.nextLine();
		
		System.out.println("Customer Name");
		String customerName = s.nextLine();
		
		System.out.println("Account Number");
		long accountNumber = s.nextLong();
		
		System.out.println("Saving Balance");
		double savingBalance = s.nextDouble();
		
		System.out.println("Branch Name : " + branchName);
		System.out.println("Bank Name : " + bankName);
		System.out.println("CutomerName : " + customerName);
		System.out.println("AccountNumber : " + accountNumber);
		System.out.println("Saving Balance : " + savingBalance);
}
}