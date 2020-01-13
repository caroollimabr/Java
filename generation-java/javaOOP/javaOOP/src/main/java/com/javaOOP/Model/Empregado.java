package com.javaOOP.Model;

import java.text.NumberFormat;

//criação da classe
public class  Empregado {
	
	private String nome;
	private double salario;
	
//Construtor (source-constructor w fields)
	public Empregado(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

//getters e setters (source-getters setters)
	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario*= 1+ percentual/100;
	}

//Métodos
	public String formatarMoeda() {
	NumberFormat nf= NumberFormat.getCurrencyInstance();
	nf.setMinimumIntegerDigits(2);
	String formatMoeda= nf.format(salario);
	return formatMoeda;
	}


	public void imprimir() {
		System.out.println(nome+" "+"salario "+ this.formatarMoeda());	
	}
}
