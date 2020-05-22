
public class Diretor extends Funcionario {
	
	public double getBonificacao() { // O Metodo GetBonificacao está definido na Class Funcionario ( Class Mãe )
		System.out.println("Chamando metodo bonificação Diretor");
		return 2000;
	}

}
