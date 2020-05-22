
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoReinaldo = new Conta();
		contaDoReinaldo.saldo = 0;
		contaDoReinaldo.deposita(0);// chamando o metodo deposita na Class Conta

		boolean conseguiuRetirar = contaDoReinaldo.saca(20); // mostrando o resultado do boolean , e sacando o valor de 20 da ContaDoReinaldo
			
		
		Conta contaDaPatricia = new Conta();
		contaDaPatricia.deposita(0);
		
		if(contaDaPatricia.transfere(0, contaDoReinaldo)) {
			System.out.println(" Patricia Transferencia realizada com sucesso seu saldo agora é " + contaDaPatricia.saldo);
		} else {
			System.out.println(" Saldo insuficiente ");
		}
		
		
		System.out.println(" Saldo da conta do Reinaldo é " + contaDoReinaldo.saldo);
	}

}
