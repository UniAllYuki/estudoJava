package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// Tratamento de Exceções.
		/* Uma exceção é qualquer condição de erro ou comportamento
		 * inesperado encontrado por um programa em execução
		// Em java, uma exceção é um objeto herdado da classe:
		 * java.lang.Exception - o compilador obriga a tratar ou propagar
		 * java.lang.RuntimeException - o compilador não obriga a tratar ou propagar.
		 */
		
		// Estrutura try-catch
		/* Bloco Try
		 * Contém o código que representa a execução normal do trecho de código
		 * que pode acarretar em uma exceção.
		 */
		/* Bloco Catch
		 * Contém o código a ser executado caso uma exceção ocorra
		 * Deve ser especificado o tipo da exceção a ser tratada (upcasting é permitido)
		 */
		
		// Bloco Finally
		/* É um bloco que contém código a ser executado independentemente de ter 
		 * ocorrido ou nao uma exceção. 
		 */
		
		method1();
	
		System.out.println("End of Program");

	}

	// Resumindo e.printStackTrace(); mostra a arvore de Exceções pra ver de onde ela veio.
	
	public static void method1() {
		System.out.println("Método 1 Start");
		method2();
		System.out.println("Método 1 End");
	}
	
	// Método
	public static void method2() {
		
		System.out.println("Método 2 Start");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int p = sc.nextInt();		
			System.out.println(vect[p]);
			} 
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Position");
			  e.printStackTrace();
			  sc.next();
			}
		catch (InputMismatchException i) {
			System.out.println("Input error");
			}

		sc.close();
		System.out.println("Método 2 End");
	}
}
