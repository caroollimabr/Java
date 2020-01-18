
//INTERFACE: Relacionamento entre classes que não pode ser herança (Cliente e Gerente) -- nao se insere nada de concreto aqui (atributos e metodos nao abstratos, por exemplo)
//Interface define métodos, implementação deles deve ser feita nas outras classes
//Deve ser usada apenas quando é necessário reutilização de código + polimorfismo
public abstract interface Autenticavel {//nao estende funcionario porque o cliente tb se beneficia dessa classe
	
	
	
	public abstract void setSenha(int senha);//metodos abstratos nao tem implementacao
	
	public abstract boolean autentica (int senha);

}


//contrato Autenticavel
	//quem assina esse contrato, precisa implementar
		//metodo setSenha
		//metodo autentica

