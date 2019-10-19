package estruturadedados;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		List<Integer> listaIdades = new ArrayList<Integer>();
		
		listaIdades.add(15);
		listaIdades.add(18);
		//...
		listaIdades.add(60);
		
		System.out.println(listaIdades.get(2));
	}
	
}
