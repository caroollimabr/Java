package com.generation.primeiroPrograma;

import java.util.Scanner;

public class CotacaoDolar {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); // habilita a leitura de dados inseridos pelo usuário

		System.out.print("Digite a cotacao do dolar: ");
		float dolar = entrada.nextFloat(); // transforma esses dados em váriável

		System.out.print("Digite o valor a ser convertido: US$ ");
		float conversao = entrada.nextFloat();

		float real = conversao * dolar;

		System.out.print("Conversao - US$ " + conversao + " = R$ " + real);
	}
}

/*
 * A CLASSE SCANNER (HABILITA A OBTENÇÃO DE DADOS ATRAVÉS DA DIGITAÇÃO) Scanner
 * scanner = new Scanner(System.in); int numeroInteiro = scanner.nextInt(); byte
 * numeroByte = scanner.nextByte(); long numeroLong = scanner.nextLong();
 * boolean booleano = scanner.nextBoolean(); float numeroFloat =
 * scanner.nextFloat(); double numeroDouble = scanner.nextDouble();
 */