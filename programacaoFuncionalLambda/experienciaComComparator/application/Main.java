package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Main {

	public static void main(String[] args) {
	
		// Experiência com Comparator

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		// Método Verboso
		/* Comparator<Product> comp = new Comparator<Product>() {
	*		@Override
	*		public int compare(Product p1, Product p2) {
	*			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	*		}
	*	};
	*/	
		
		// Método Lambda
		/*Comparator<Product> comp = (p1,p2) -> {
		*	return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		*};
		*/
		
		// Método Lambda Bem Melhorado
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}
