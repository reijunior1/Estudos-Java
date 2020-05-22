
//contrato Autenticavel 
// quem assina esse contrato precisa implementar 
// metodo e SetSenha e autentica

public abstract interface Autenticavel  {


	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
	
		}
