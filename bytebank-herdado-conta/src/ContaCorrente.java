
public class ContaCorrente extends Conta implements Tributavel{ //OBS: Construtores não são herdados da Class Mãe.
	
	public ContaCorrente(int agencia, int numero) { // Criando construtor utilizando Construtor da Classe Mãe.
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
		
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
