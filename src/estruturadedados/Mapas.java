package estruturadedados;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

	public static void main(String[] args) {
		Map<String, Integer> alunosIdade = new HashMap<String, Integer>();
		
		alunosIdade.put("Jonathan", 31);
		alunosIdade.put("Fulano", 18);
		alunosIdade.put("Ciclano", 50);
		
		alunosIdade.get("Jonathan");
	}
	
}
