package calculadora;

import java.util.Scanner;

public class calculadora {
	Scanner sc = new Scanner(System.in);
	
	public void init() {
		
	while(true) {
		System.out.println("Informe o calculo desejado: ");
		String txt = sc.nextLine();
		String operacao[] = new String[3];
		
		//split vai quebrar uma string p/ caractere
		operacao = txt.split(" ");
		float valor1 = Float.parseFloat(operacao[0]);
		float valor2 = Float.parseFloat(operacao[2]);
		
		
		//boolean repete = false;
		//while (!sair){}
		//if (txt.equalsIgnoreCase("sair")){}
		
		switch (operacao[1]) {
		case "+":
			System.out.println(txt + " = " + this.adicao(valor1, valor2));
			break;
		case "-":
			System.out.println(txt + " = " + this.subtracao(valor1, valor2));
			break;
		case "*":
			System.out.println(txt + " = " + this.multiplicacao(valor1, valor2));
			break;
		case "/":
			System.out.println(txt + " = " + this.divisao(valor1, valor2));
			break;
		default:
			System.out.println("Operador não identificado, tente outra vez!");
			//break;
		}	
		
		System.out.println("--Operações--");
		System.out.println("Deseja continuar com as operações? [S/N]: ");
		String opcao = sc.nextLine();
		
		if(opcao.equalsIgnoreCase("N") || opcao.equalsIgnoreCase("n")) {
			System.out.println("EXIT...!");
			break;
		}
	}
}
		
	public float adicao(float v1, float v2) {
		return v1 + v2;
	}
	
	public float subtracao(float v1, float v2) {
		return v1 - v2;
	}
	
	public float multiplicacao(float v1, float v2) {
		return v1 * v2;
	}
	
	public float divisao(float v1, float v2) {
		return v1 / v2;
	}
	
}
