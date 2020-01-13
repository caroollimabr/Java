package com.generation.primeiroPrograma;

import java.util.Scanner;

public class Comissao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Identificacao do vendedor: ");
		int idVendedor = entrada.nextInt();
		
		System.out.print("ID da peca: ");
		int idPeca = entrada.nextInt();
		
		System.out.print("Preco unitario da peca: ");
		float precoPeca = entrada.nextInt();
		
		System.out.print("Quantidade de pecas vendidas: ");
		float pecasVendidas = entrada.nextFloat();
		
		float comissao = (float) ((precoPeca * pecasVendidas) * 0.05);
		System.out.print("Comissao: ");
		
		/*
		 
		 OUTRA OPÇÃO
		 (declara float comissao, int idVenderdor... em cima)
		 comissao = (precoPeca * pecasVendidas) * 0.05f (declara que o numero é float)
		
		 */
		
	}
}
