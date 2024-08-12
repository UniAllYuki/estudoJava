package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Main {

	public static void main(String[] args) {
	
		// Tipos Curinga
		/*  List <Object> não é o supertipo de qualquer tipo de lista:
		 * List<Object> myObjs = new ArraList<Object>();
		 * List<Integer> myNumbers = new ArrayList<Integer>();
		 * myObjs = myNumbers; // Erro de Compilação
		 * 
		 *   O Supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
		 * List<?> myObjs = new ArraList<Object>();
		 * List<Integer> myNumbers = new ArrayList<Integer>();
		 * myObjs = myNumbers;
		 */
		
		// Curingas Delimitados
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Área Total: " + String.format("%.2f",totalArea(myCircles)));
		
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
	
}
