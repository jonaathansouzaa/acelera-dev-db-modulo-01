package estruturadedados;

import java.util.LinkedList;
import java.util.List;

public class ListasLinkadas {

	public static void main(String[] args) {
		List<Integer> listaLinkadaIdades = new LinkedList<Integer>();
		
		listaLinkadaIdades.add(16);
		listaLinkadaIdades.add(17);
		//...
		listaLinkadaIdades.add(60);
		
		System.out.println(listaLinkadaIdades.get(1));
	}
	
}
