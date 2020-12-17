public class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente titular;
	private static long totalDeContasAbertas; // Este � um atributo est�tico, ou seja, um atributo da classe Conta, e n�o de seus objetos.
	
	// Este � o construtor. Esquivalente ao def __init__(self, ...): do python
	// O construtor basicamente serve para obrigarmos quem usa nossa classe a passar par�metros na instancia��o do objeto, assim,
	// conseguimos manter um padr�o entre todos os objetos, criados seguindo regras de neg�cio.
	public Conta(int agencia, int numero) { // Construtor padr�o
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando a conta " + this.agencia + " " + this.numero);
		Conta.totalDeContasAbertas++;
	}
	
	// Podemos inclusive criar mais de um construtor por classe. Desta forma, podemos definir valores padr�o para atributos n�o informados.
	// Repare que utilizamos aqui o this como se ele fosse um m�todo. Quando utilizamos o this desta forma, ele chama o construtor do objeto,
	// Assim, podemos definir valores padr�o para os atributos obrigat�rios.
	public Conta(int numero) { // Construtor complementar (define valores padr�o para atributos obrigat�rios)
		this(0001, numero);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.saldo += valor;
			return true;
		}
		return false;
	}
	
	// para trabalhar com atributos privados, precisamos utilizar os m�todos getters e setters. Chamamos isso de interface do objeto, � a maneira correta de interagir com eles.
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("N�mero de ag�ncia n�o pode ser menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("N�mero de conta n�o pode ser menor ou igual a 0");
		}
		this.numero = numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	// Este � um m�todo est�tico, ou seja, um m�todo da classe Conta, e n�o de seus objetos. N�o precisamos ter nenhum objeto instanciado para utilizar m�todos est�ticos.
	public static long getTotalDeContasAbertas() {
		return Conta.totalDeContasAbertas;
	}
}