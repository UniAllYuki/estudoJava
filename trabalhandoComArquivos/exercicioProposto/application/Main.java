package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		// Exercício Proposto
		// Esse código inicial é opcional, fiz pq sou maluco.
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos produtos irá adicionar na lista: ");
		int n = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		String[] vect = new String[n];
		
		
		for (int i=0;i<n;i++) {
			System.out.println();
			System.out.println("Digite os dados do produto " + (i+1) + ": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine(); 
			System.out.print("Valor: ");
			Double value = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantity = sc.nextInt();
			
			String s = name + "," + value + "," + quantity;
			vect[i] = s;
		}
		
		String path = "c:\\zproduct\\products.csv";	
		
		@SuppressWarnings("unused")
		boolean success = new File("c:\\zproduct\\result").mkdir();
		
		// Salvando valores Double apenas com 1 casa decimal...
	
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String line : vect) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		// Até aqui foi opcional.
		
		String path2 = "c:\\zproduct\\result\\summary.csv";	
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while (line != null){
				String[] info = line.split(",");
				String name = info[0];
				Double value =  Double.parseDouble(info[1]);
				Integer quantity = Integer.parseInt(info[2]);
				
				Product p = new Product(name, (Double) value, (Integer) quantity);				
				
				list.add(p);
				
				line = br.readLine();
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {
				
				for (Product p : list) {
					bw.write(p.getName() + "," + String.format("%.2f", p.total()));
					bw.newLine();
				}
				
				System.out.println();
				System.out.println(path2 + " criado!");
			
			}
			catch (IOException e){
				System.out.println("Error: " + e.getMessage());
			}
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println();
		
		try (BufferedReader br2 = new BufferedReader(new FileReader(path2))){	
			String line2 = br2.readLine();
			
			while (line2 != null) {
				System.out.println(line2);
				line2 = br2.readLine();
			}
		}
			catch (IOException e){
				System.out.println("Error: " + e.getMessage());
			}
	
		sc.close();
	}

	// Fiz do meu jeito, aparentemente é mais "primitivo" que o jeito que um profissional faria, mas está funcionando :D
	
}
