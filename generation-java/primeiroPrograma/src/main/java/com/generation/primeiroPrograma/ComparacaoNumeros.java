package com.generation.primeiroPrograma;

import java.util.Scanner;

public class ComparacaoNumeros {
	public static void main (String [] args) {
		
		System.out.println("Mostrador de relacionamentos entre numeros");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		float n1 = entrada.nextFloat();
		
		System.out.print("Digite o segundo numero: ");
		float n2 = entrada.nextFloat();
		
		if (n1 == n2) {
			System.out.println("Numeros iguais.");
		} else {
			System.out.println("Numeros diferentes.");
		}
		
	}
}
