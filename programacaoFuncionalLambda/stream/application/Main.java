package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
	
		// Stream
		/* É uma sequência de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas"
		 *  Coleção, array, função de iteração, recurso de E/S
		 */

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Yuki", "Mitsuo", "Akio");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		// Sequencia de Fibonacci
		
		Stream<Long> st4 = Stream.iterate(new Long[] {0L,1l}, p -> new Long[] {p[1],p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(15).toArray()));
		
	}

}
