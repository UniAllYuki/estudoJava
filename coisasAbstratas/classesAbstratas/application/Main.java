package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
	
		// Classes Abstratas
		/* São classes que não podem ser instanciadas.
		 * É uma forma de garantir a herança total: somente subclasses não abstradas
		 * podem ser instanciadas, mas nunca a superclasse abstrata.
		 */
		// Exemplo: Em um banco, não existe conta normal, apenas empresarial e poupança.
		// Então é só transformar o objeto conta em uma Classe abstrata.
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total Balance: %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		
		for (Account acc : list) {
			System.out.printf("Updated Balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
	}

}
