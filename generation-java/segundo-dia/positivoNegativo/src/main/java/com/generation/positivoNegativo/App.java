package com.generation.positivoNegativo;

import java.util.Scanner;

public class App {
	public static void main( String[] args )
    {
        int numero;
        String parar;
        
        do {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = entrada.nextInt();
        
        if (numero > 0) {
        System.out.println("Esse numero e positivo");
        } else if (numero < 0) {
        System.out.println("Esse numero e negativo");
        } else {
        System.out.println("Esse numero e 0");
        }
        
        System.out.println("Parar? (Digite sim ou nao)");
        parar = entrada.next();
        
        } while (!parar.equals("sim"));
        
        
        
    }
}