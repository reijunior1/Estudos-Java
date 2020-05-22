public class TestaBanco {
	public static void main(String[] args) {
		
		Conta contaDoReinaldo = new Conta();
		contaDoReinaldo.titular = new Cliente();
		contaDoReinaldo.titular.nome = "Reinaldo Couto";
		contaDoReinaldo.deposita(1000);
		
		Conta contaDaPatricia = new Conta();
		contaDaPatricia.titular = new Cliente();
		contaDaPatricia.titular.nome = "Patricia Pedrosa";
		contaDaPatricia.deposita(3000);
		
		
		contaDaPatricia.transfere(300, contaDoReinaldo);
		
		
		System.out.println("O Saldo da sua conta do Reinaldo é R$ " + contaDoReinaldo.getSaldo());
		System.out.println("O Saldo da sua conta da Patricia é R$ " + contaDaPatricia.getSaldo());

		
	}
}
