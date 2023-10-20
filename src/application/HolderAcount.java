package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class HolderAcount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int num = scan.nextInt();
		System.out.print("Holder: ");
		scan.nextLine();
		String hd = scan.nextLine();
		System.out.print("Initial balance: ");
		double initBal = scan.nextDouble();
		System.out.print("Withdraw limit: ");
		double wDrawLimit = scan.nextDouble();

		Account acc = new Account(num, hd, initBal, wDrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = scan.nextDouble();

		if (amount > acc.getWithdrawLimit()) {
			System.out.println("Withdraw error: The amount exceeds withdraw limit");
		} else if (amount > acc.getBalance()) {
			System.out.println("Withdraw error: Not enougth balance");

		} else {
			acc.withdraw(amount);
			System.out.printf("New Balance: " + String.format("%.2f", acc.getBalance()));
		}
	}
}
