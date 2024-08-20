package application;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		// Map<K,V>
		/* É uma coleção de pares chave/valor
		 *   Cada valor vai ter uma chave definida, a chave não pode ter repetição.
		 */

		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Yuki");
		cookies.put("email", "yukigalaxy@gmail.com");
		cookies.put("phone", "77988123456");
		
		cookies.remove("email");
		
		System.out.println("COOKIES:");
		
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
	}

}
