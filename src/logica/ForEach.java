package logica;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<Integer> idades = new ArrayList<Integer>();
		idades.add(19);
		idades.add(20);
		
		for(Integer idade : idades) {
			System.out.println(idade);
		}
	}
	
}
