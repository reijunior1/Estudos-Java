
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {// Criando construtor utilizando Construtor da Classe Mãe.
		super(agencia, numero);

	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}
}