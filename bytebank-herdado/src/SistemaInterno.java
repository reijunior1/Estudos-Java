
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autentica = fa.autentica(this.senha);
		if(autentica) {
			System.out.println("Acesso Liberado ao Sistema");
		} else {
			System.out.println("Acesso bloqueado, senha incorreta!");
		}
		
	}

}
