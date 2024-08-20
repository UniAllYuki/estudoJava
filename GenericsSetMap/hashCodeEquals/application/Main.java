package application;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		// HashCode e equals
		/* São operações da classe oBject utilizadas para comparar se um objeto é igual a outro.
		 */
		
		// Nota: Invés de só anotar o exemplo do curso eu decidi eu mesmo brincar com o Equals (Fds o HashCode) 
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		
		boolean repetir = true;
		
		while (repetir) {
		System.out.println("Escolha um número e depois rode um dado de 4, 12 ou 20 lados!");
		System.out.print("Número: ");
	    Integer a = sc.nextInt();
		
	    System.out.print("Dado de quantos lados? (4, 12, 20): ");
		Integer n = sc.nextInt();

		if (!n.equals(4) && !n.equals(12) && !n.equals(20)) {
			System.out.println("Valor inválido!");
			System.exit(0);
		}
	
		Integer randomInt = random.nextInt(n);		
				
		if (randomInt.equals(0)) {
			randomInt = randomInt + 1;
		}
		
		if (randomInt.equals(a)) {
			System.out.println("Parabéns! Seu sortudo! Seu número " + a + " é igual ao número roletado " + randomInt + "." );
		}
		else {
			System.out.println("Eita que azar! Seu número " + a + " é diferente ao número roletado: " + randomInt + "." );
		}
		System.out.println();
		System.out.println("Deseja Reiniciar? (S/N)" );
		String p = sc.next();
		if (p.equals("n") || p.equals("N")) {
			repetir = false;
		}
		
		
	}

	sc.close();
	}

}
