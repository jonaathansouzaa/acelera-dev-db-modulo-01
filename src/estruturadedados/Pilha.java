package estruturadedados;

import java.util.Stack;

public class Pilha {
	
	public static void main(String[] args) {
		Stack<Integer> pilhaIdade = new Stack<Integer>();
		
		pilhaIdade.push(16);
		pilhaIdade.push(17);
		//...
		pilhaIdade.push(60);
		
		System.out.println(pilhaIdade.pop());
	}

}
