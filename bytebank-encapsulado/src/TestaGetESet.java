public class TestaGetESet {
	
	public static void main(String[] args) {  
		
		Conta conta = new Conta(100,10);//informar o numero da conta e agencia que será criada
		Cliente reinaldo = new Cliente();
		conta.setTitular(reinaldo);
		reinaldo.setNome("Reinaldo Couto");
		conta.getTitular().setProfissao("programador");
		conta.getTitular().setCpf("214.520.148-33");
		
		Conta conta2 = new Conta(100,11);
		Cliente patricia = new Cliente();
		conta.setTitular(patricia);
		patricia.setNome("Patricia Pedrosa");
			
		conta.deposita(1000);
			
		System.out.println("O Saldo da sua conta é R$: " + conta.getSaldo());
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(conta.getTitular().getCpf());
		
		System.out.println(" A quantidade total de contas abertas são " + Conta.getTotal());
	}
}
