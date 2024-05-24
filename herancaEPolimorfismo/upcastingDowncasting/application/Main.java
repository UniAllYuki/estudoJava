package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
	
		// Upcasting e Downcasting
		/* Upcasting 
		 	* Casting da subclasse para superclasse. 
		 	* Uso comum: polimorfismo. 
		 * Downcasting
		 	* Casting da superclasse para subclasse 
		 	* Pavlra instanceof
		 	* Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)
		 */

		// Exemplo: Usando mesmas classes da ultima aula, a Conta e a Conta Empresárial. Implementar agora uma conta Poupança.
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		
		// UPCASTING (Jogar objetos da subclasse para a superclasse)
		// *teoricamente é tipo, uma conta empresarial é uma conta
		
		Account acc1 = bacc;
		Account acc2 = new SavingsAccount(1003, "Anna", 0.0, 0.01);
		
		// DOWNCASTING (Jogar objetos da superclasse para a subclasse)
		// Precisa de Casting
		
		BusinessAccount acc3 = (BusinessAccount)acc1;
		acc3.loan(100.0);
		
		// BusinessAccount acc4 = (BusinessAccount)acc2;
		// ^^^^^^ isso da erro, por que a acc2 é uma SavingAccount (Outra subclasse).
		// Ou seja, nem sempre o Downcasting da certo. Mas da pra testar
		
		if (acc2 instanceof BusinessAccount) {
			BusinessAccount acc4 = (BusinessAccount)acc2;
			acc4.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc2 instanceof SavingsAccount) {
			SavingsAccount acc4 = (SavingsAccount)acc2;
			acc4.updateBalance();
			System.out.println("Uptade!");
		}
		
		
	}

}
