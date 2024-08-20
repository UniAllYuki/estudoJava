package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		// Set<T> (Interface)
		/* Representa um conjunto de elementos (similar ao da Álgebra)
		 * Não admite repetições
		 * Elementos não possuem posição
		 * Acesso, inserção e remoção de elementos são rápidos
		 */
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook"));
		
		set.remove("Tablet");
		
		set.removeIf(x -> x.length() >= 3);
		
		for (String p : set) {
			System.out.println(p);
		}
		
		

	}

}
