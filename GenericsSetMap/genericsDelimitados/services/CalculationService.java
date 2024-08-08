package services;

import java.util.List;

public class CalculationService {

	public static <Y extends Comparable<Y>> Y max(List<Y> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista não pode ser Vazia");
		}
		Y max = list.get(0);
		for (Y item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
	
}
