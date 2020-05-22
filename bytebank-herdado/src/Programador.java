
public class Programador extends Funcionario {
	
	public double getBonificacao() { // O Metodo GetBonificacao está definido na Class Funcionario ( Class Mãe )
		System.out.println("Chamando metodo bonificação Programador");
		return 300;
	}
}

