package com.generation.primeiroPrograma;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a idade da sua mae: ");

		int idademae = entrada.nextInt();

		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();

		int diferenca = idademae - idade;
		System.out.print("Voces tem " + diferenca + " anos de diferenca.");
	}
}
