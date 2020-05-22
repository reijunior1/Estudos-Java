//Gerente é um FuncionarioAutenticavel

//(extends ) = Gerente herda da Class Funcionario

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() { // O Metodo GetBonificacao está definido na Class Funcionario ( Class Mãe )
		return super.getSalario(); // pegando o metodo getBonificacao e atributo getSalario na
									// Class Mãe
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
