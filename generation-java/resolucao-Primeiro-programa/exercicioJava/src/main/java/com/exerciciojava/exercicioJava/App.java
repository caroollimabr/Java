package com.exerciciojava.exercicioJava;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner ler = new Scanner (System.in);
    	
    	int numero;
    	
    	System.out.println("Digite um número: ");
    	numero = ler.nextInt();
    	
    	if(numero >= 0) {
    		System.out.println("O número digitado é positivo!");
    		
    	} else {
    		System.out.println("O número digitado é negativo! ");
    	}
    	
    	
    	
    	
    	
    
    }
}













/**
 * {
    		System.out.println(n1);
    	} else {
    		System.out.println(n2);
    	}
    	if(n1 > n3) {
    		System.out.println(n1);
    	} else {
    		System.out.println(n3);
    	}
    	if(n2 > n3) {
    		System.out.println(n2);
    	} else {
    		System.out.println(n3);
    	}
    	if(n3 > n1) {
    		System.out.println(n3);
    	}else {
    		System.out.println(n1);
    	}
 */






