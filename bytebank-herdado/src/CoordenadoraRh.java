//(extends ) = CoordenadoraRh herda da Class Funcionario

public class CoordenadoraRh extends Funcionario {

	public double getBonificacao() { // O Metodo GetBonificacao está definido na Class Funcionario ( Class Mãe )
		System.out.println("Chamando metodo bonificação Coordenadora RH");
		return 200; // pegando o metodo getBonificacao e atributo getSalario na
															// Class Mãe
	}
}
