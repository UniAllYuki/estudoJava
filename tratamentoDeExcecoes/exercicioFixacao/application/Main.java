package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		
		// Exercício de Fixação. (Pior que foi fácil.)

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account Data: ");
			System.out.print("Number: ");
				int number = sc.nextInt();
			System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
			System.out.print("Initial Balance: ");
				double ib = sc.nextDouble();
			System.out.print("Withdraw limit: ");
				double wl = sc.nextDouble();
			
			Account acc = new Account(number, name, ib, wl);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
				double ammount = sc.nextDouble();
			acc.withdraw(ammount);
			
			System.out.printf("New Balance: %.2f", acc.getBalance());
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		/* Aprendi sem querer, como a RuntimeException abriga as exceções, tanto que
		 * essa exceção DomainException deriva dela, ela não pode ficar abaixo do 
		 * catch RuntimeException, interessante.
		 */
		catch (RuntimeException a) {
			System.out.println("Unexpected Error! Check the Commands!");
		}
		
		sc.close();
	}

}
