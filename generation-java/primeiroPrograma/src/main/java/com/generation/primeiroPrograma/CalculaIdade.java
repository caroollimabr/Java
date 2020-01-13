package com.generation.primeiroPrograma;

import java.util.Scanner;

public class CalculaIdade {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual e a sua idade? Digite os anos: ");
		int idadeAnos = entrada.nextInt();
		
		System.out.print("Digite os meses: ");
		int idadeMeses = entrada.nextInt();
		
		System.out.print("Digite os dias: ");
		int idadeDias = entrada.nextInt();
		
		int idadeTotal = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;
		System.out.print("Sua idade em dias: " + idadeTotal);
		
	}
}
