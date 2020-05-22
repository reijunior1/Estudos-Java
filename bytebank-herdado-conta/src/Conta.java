
public abstract class Conta {

	protected double saldo; // atributo saldo
	private int agencia; // atributo agencia
	private int numero; // atributo numero
	private Cliente titular; // atributo titular
	private static int total; // informando a quantidades de contas já criadas, usando o static para a Class
								// Conta inteira.

	public Conta(int agencia, int numero) { // para criar uma conta obrigatorio ter numero de agencia e conta.
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;

	}

	// criando metodos (define o comportamento ou maneira de fazer algo)
	public abstract void deposita(double valor);

	// retornando metodos
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("saque completado no valor de R$ " + valor);
			return true;
		} else {
			System.out.println("Saldo Indisponivel");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

}