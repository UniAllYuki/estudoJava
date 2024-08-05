package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Y> {

	private List<Y> list = new ArrayList<>();
	
	public void addValue(Y value) {
		list.add(value);
	}
	
	public Y first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("Lista está vazia.");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
	
	
}

