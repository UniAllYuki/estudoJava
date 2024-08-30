package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Main {

	public static void main(String[] args) {	
		
		// Function
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		for (String line : names) {
			System.out.println(line);
		}
		
	}

}
