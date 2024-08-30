package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
	
		// Exercício de Fixação.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com diretório do arquivo: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Valor Referencial de Salário: ");
			Double n = sc.nextDouble();
			System.out.println("Email dos funcionário cujo valor do Salário é maior que " + n);
			
			Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> emails = list.stream()
					.filter(p -> p.getSalary() > n)
					.map(p -> p.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
		
			emails.forEach(System.out::println);
			
			Double sum = list.stream()
					.filter(p -> p.getName().startsWith("M"))
					.map(p -> p.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Soma dos salários cujo nome do funcionário comece com a letra 'M': " + String.format("%.2f", sum));
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
		sc.close();
	}

}
