package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Main {

	public static void main(String[] args) {	
		
		// Predicate
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(p -> p.getPrice() >= 100);
		
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}
