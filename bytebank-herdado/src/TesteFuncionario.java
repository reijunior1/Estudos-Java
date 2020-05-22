
public class TesteFuncionario {

	public static void main(String[] args) {

		// Instanciando funcionario
		Funcionario reinaldo = new Diretor();

		// Adcionando nome,CPF,salario,Cargo
		reinaldo.setNome("Reinaldo Couto");
		reinaldo.setCpf("214.520.148-33");
		reinaldo.setSalario(5000);
		reinaldo.setCargo("Programador Java");
		reinaldo.setCargo("Gerente T.I");

		// Imprindo valores
		System.out.println(reinaldo.getNome());
		System.out.println(reinaldo.getCpf());
		System.out.println(reinaldo.getSalario());
		System.out.println(reinaldo.getCargo());

		System.out.println(reinaldo.getBonificacao());
	}
///
}
