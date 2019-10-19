package logica;

public class If {

	public static void main(String[] args) {
		int idade = 19;
		
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else if (idade >= 18 && idade <= 60) {
			
		} else {
			System.out.println("Jovem");
		}
	}
	
}
