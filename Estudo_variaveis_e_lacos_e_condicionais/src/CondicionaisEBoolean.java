
public class CondicionaisEBoolean {
	public static void main(String[] args) {
		int idade = 4;
		int quantidadeDePessoas = 2;
		
		// Em Java o if, else e else if s�o feitos desta maneira:
		if (idade >= 18) {
			System.out.println("Seja bem vindo.");
		} else if (quantidadeDePessoas > 1) {
			System.out.println("Voc� � menor de idade, mas est� acompanhado. Bem vindo.");
		} else {
			System.out.println("Voc� � menor de idade.");
		}
		
		// Podemos ainda resumir o c�digo acima abstraindo os casos onde � permitida a entrada.
		// Em Java, or ou and � feito como || ou &&, respectivamente.
		if (idade >= 18 || quantidadeDePessoas > 1) {
			System.out.println("Bem vindo.");
		} else {
			System.out.println("Voc� � menor de idade.");
		}
		
		// Assim como em outras linguagens, Java interpreta express�es booleanas dentro do if, ou seja, podemos resumir as express�es a uma �nica vari�vel:
		boolean entradaPermitida = (idade >= 18 || quantidadeDePessoas > 1);
		
		if (entradaPermitida) {
			System.out.println("Bem vindo.");
		} else {
			System.out.println("Voc� � menor de idade.");
		}
	}
}
