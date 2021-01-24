
public class TestaPooEncapsulada {
	public static void main(String[] args) {
	
		Cliente sergio = new Cliente();
		Conta conta = new Conta(1234, 123445678);
		Conta conta2 = new Conta(634523477); // Esta conta est� sendo criada com o construtor complementar, que n�o exige uma ag�ncia. Neste caso, � utilizada a ag�ncia padr�o 0001
		Conta conta3 = new Conta(3456, 123468987);
		conta.deposita(300);
		conta.setTitular(sergio); // nada demais, apenas passamos a refer�ncia para o setter do objeto conta, assim como os outros atributos acima.
		System.out.println(conta.getAgencia());
		
		// Utiliza o m�todo est�tico (m�todo da pr�pria classe, e n�o de algum objeto)
		System.out.println("O total de contas criadas com a nossa classe, at� o momento, � " + Conta.getTotalDeContasAbertas());
		
		// para trabalhar com getters e setters de refer�ncias dentro do nosso objeto, utilizamos o getter do objeto e, em seguida, utilizamos os getters/setters da refer�ncia
		conta.getTitular().setNome("Sergio de Magalhaes Nunes");
		
		System.out.println(conta.getTitular().getNome());
	
		// � confuso, mas basicamente estamos fazendo isso:
		Cliente outraReferenciaAoSergio = conta.getTitular();
		System.out.println(outraReferenciaAoSergio.getNome());
		
		// olhe o endere�o de mem�ria das nossas refer�ncias, � tudo igual:
		System.out.println(sergio);
		System.out.println(conta.getTitular());
		System.out.println(outraReferenciaAoSergio);
		// primeiro, criamos o objeto Cliente e colocamos sua refer�ncia na vari�vel sergio;
		// depois, atribu�mos essa refer�ncia ao atribulo "titular" do objeto conta atrav�s do conta.setTitular(sergio);
		// depois, atribu�mos essa mesma refer�ncia � nova vari�vel (nova REFER�NCIA, e n�o novo OBJETO) "outraReferenciaAoSergio";
		// portanto, sergio = conta.getTitular() = outraReferenciaAoSergio;
		
	}
}
