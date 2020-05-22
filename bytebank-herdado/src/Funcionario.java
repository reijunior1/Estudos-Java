// OBS: obstract na Class não pode instanciar dessa Class, ex: Não pode dar new .
public abstract class Funcionario {

	private int senha = 2222;

	public void autentica(Autenticavel fa) {
		boolean autentica = fa.autentica(this.senha);
		if (autentica) {
			System.out.println("Acesso Liberado ao Sistema");
		} else {
			System.out.println("Acesso bloqueado, senha incorreta!");
		}

	}

	private String nome; // Atributos da Class Funcionario
	private String cpf;
	private double salario; // publico para os Filhos da Class Funcionario
	private String cargo;

	// Metodo abstrato não possui corpo, não poder ter implementação, apenas o
	// primeiro filho da Classe pode implementar.
	public abstract double getBonificacao();

//criado Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
