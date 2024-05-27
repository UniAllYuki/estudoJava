package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
		
		// Exercício de Fixação de Classes e Métodos Abstratos. (Esse parece que vai ser complicado)
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for (int i = 1; i<=n;i++) {
			System.out.println("Tax Payer #" + i + " data: ");
			System.out.print("Individual or Company (i/c)? ");
			char ic = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			if (ic == 'i') {
				System.out.print("Health Expenditures: ");
				double healthExpenditures =  sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else if (ic == 'c') {
				System.out.print("Number of Employees: ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			} else {
				System.out.println("Index Command inexpected...");
				System.exit(0);
			}
			
		}
		
		double sum = 0;
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tp : list) {
			System.out.printf("%s: $%.2f%n", tp.getName(), tp.tax());
			sum += tp.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $%.2f", sum);
		
		sc.close();
	}
	
	// Incrivelmente eu consegui, sozinho e sem o diagrama o. o

}
