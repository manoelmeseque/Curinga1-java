package curinga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1, 2, 3, 4);
		List<Double> doubleList = Arrays.asList(3.14, 5.7);
		List<Object> objectList = new ArrayList<>();
		
		copy(intList, objectList);
		copy(doubleList, objectList);
		
		print(objectList);

	}
	
	public static void copy(List<? extends Number> origem, List<? super Number> destino) {
		for(Number n: origem) {
			destino.add(n);
		}
	}
	
	public static void print(List<?> list) {
		for(Object obj: list) {
			System.out.println(obj);
		}
	}

}
