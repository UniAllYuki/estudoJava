package application;

import java.util.Scanner;

import services.PrintService;

public class Main {

	public static void main(String[] args) {
		
		// Generics
		/*	 Generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo.
		 *   Uso comum: coleções
		 */

		// Problema Motivador 
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("Quantos valores? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n ; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("Primeiro: " + ps.first());
		
		sc.close();
	}

}
