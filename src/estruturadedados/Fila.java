package estruturadedados;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();
		
		fila.offer(16);
		fila.offer(17);
		//...
		fila.offer(60);
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
	
}
