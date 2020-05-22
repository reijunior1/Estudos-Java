public class Conta {

	double saldo; // atributo saldo
	int agencia; // atributo agencia
	int numero; // atributo numero
	String titular; // atributo titular

	// criando metodos (define o comportamento ou maneira de fazer algo)
	public void deposita(double valor) {
		this.saldo += this.saldo + valor; // this refere-se a esta conta, utiliza-se em atributos.
	}

	
	// retornando metodos
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}
