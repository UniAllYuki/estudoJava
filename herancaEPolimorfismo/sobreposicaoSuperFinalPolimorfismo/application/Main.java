package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
	 
		// AULA Sobreposição, palava super, anotação @Override
		// Sobreposição ou sobrescrita
		/* É a implementação de um método de uma superclasse na subclasse
		 * É fortemente recomendável usar a anotação @Override em um método sobrescrito!
		 */
		// EXEMPLO SOBREPOSIÇÃO
		/* Suponha que a operação saque possui uma taxa no valor de 5.0. Entretando se a conta
		 * for do tipo poupança, esta taxa não deve ser cobrada.
		 * Resposta: Sobrescrever o método Withdraw na subclasse SavingsAccount.
		 */

		Account acc1 = new Account(1001, "Alex", 1000.00);		
		acc1.withdraw(200.0);		
		System.out.println(acc1.getBalance());
				// 795.0
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
				// 800.0
		
		// PALAVRA SUPER
		/* É possível chamar a implementação da superclasse usando a palavra super.
		 * EXEMPLO: Suponha que, na clase BusinessAccount, a regra para ssaque seja realizar o saque
		 * normalmente da superclasse descontar mais 2.0.
		 */
		
		Account acc3 = new Account(1003, "Steve", 1000.00);
		acc3.withdraw(200);
		System.out.println(acc3.getBalance());
				//795.0
		
		Account acc4 = new BusinessAccount(1003, "João", 1000.0, 500);
		acc4.withdraw(200);
		System.out.println(acc4.getBalance());
				//793.0
		
		// Classes e métodos final
		/* A palavra Final na classe ( public final class ) evite que a classe seja herdada
		 * A palavra Final no método evita que o mesmo sera sobreposto.
		 */
		
		// POLIMORFISMO
		/* Pilares da OOP (Encapsulamento, Herança, Polimorfismo.)
		 * Em Programação Orientada a Objetos, polimorfismo é um recurso que permite que variáveis
		 * de um mesmo tipo mais genérico possam apontar para objetos de tipos específicos diferentes,
		 * tendo assim comportamentos diferentes conforme cada tipo específico.
		 */
		
		Account x = new Account(1020, "Alexandre", 1000.0);		
		Account y = new SavingsAccount(1023, "Mariana", 1000.0, 0.01);
		
		y.withdraw(50.0);
		x.withdraw(50.0);
		
		System.out.println(x.getBalance());
			//945.0
		System.out.println(y.getBalance());
			//950.0
		
	}

}
