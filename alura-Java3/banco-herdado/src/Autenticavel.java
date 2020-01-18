
//INTERFACE: Relacionamento entre classes que n�o pode ser heran�a (Cliente e Gerente) -- nao se insere nada de concreto aqui (atributos e metodos nao abstratos, por exemplo)
//Interface define m�todos, implementa��o deles deve ser feita nas outras classes
//Deve ser usada apenas quando � necess�rio reutiliza��o de c�digo + polimorfismo
public abstract interface Autenticavel {//nao estende funcionario porque o cliente tb se beneficia dessa classe
	
	
	
	public abstract void setSenha(int senha);//metodos abstratos nao tem implementacao
	
	public abstract boolean autentica (int senha);

}


//contrato Autenticavel
	//quem assina esse contrato, precisa implementar
		//metodo setSenha
		//metodo autentica

