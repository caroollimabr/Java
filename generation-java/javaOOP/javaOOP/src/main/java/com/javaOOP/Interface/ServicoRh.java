package com.javaOOP.Interface;

import com.javaOOP.Model.Empregado;

//faz rodar os métodos
public interface ServicoRh {
	
	String contratar(Empregado contrato);
	String desligar(Empregado contrato);

}
