
public class TestaEscopo {
	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 1;
		boolean acompanhado =  quantidadePessoas >= 2;

		if (idade >= 18 || acompanhado) {
			System.out.println("Voce pode entrar ");
		} else {
			System.out.println(" Voce não pode entrar");
		}
	}
}

