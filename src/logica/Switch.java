package logica;

public class Switch {

	public static void main(String[] args) {
		int idade = 19;
		
		switch(idade) {
			case 18: System.out.println("Jovem");
					break;
			case 60: System.out.println("Mais Jovem");
					break;
			default:
					System.out.println("Idade não identificada");
					break;
		}
	}
	
}
