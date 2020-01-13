package com.generation.ordemDecrescente2;

import java.util.Arrays;
import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		
		//Le os numeros e coloca-os dentro do array
		Scanner numeros = new Scanner(System.in);
		
		int[] listaDeNumeros = new int[3];

		for (int num = 0; num < listaDeNumeros.length; num++) {
			System.out.print("Numero " + (num + 1) + ": ");
			listaDeNumeros[num] = (numeros.nextInt());
		}
		
		//Ordena as informações
		Arrays.sort(listaDeNumeros);
		
		//Coloca em ordem decrescente
		System.out.print("Ordem decrescente:    ");

		for (int posicao = listaDeNumeros.length - 1; posicao >= 0; posicao--)

		{
			System.out.print(listaDeNumeros[posicao] + "  ");
		
		}
	}
}
