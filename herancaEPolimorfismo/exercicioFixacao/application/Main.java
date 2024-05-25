package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		// Exercicio de Fixação

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();		
		
		List<Product> list =  new ArrayList<>(); 
		
		for (int i=1; i<=n;i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Commom, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (ch == 'c') {
				Product product = new Product(name, price);
				list.add(product);
			} else if (ch == 'u'){
				System.out.print("Manufacture Date (DD/MM/YYYY): ");
				Date md = sdf.parse(sc.next());
				Product product = new UsedProduct(name, price, md);
				list.add(product);
			} else {
			System.out.print("Customs fee: ");
			double cf = sc.nextDouble();
			Product product = new ImportedProduct(name, price, cf);
			list.add(product);
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product product : list) {
			System.out.println(product.priceTag());
		}
		
		
		sc.close();
	}

}
