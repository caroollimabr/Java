package com.exerciciojava.exercicioJava5;

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
        
        double a, b;
        int opcao = 1;
        
        System.out.println("Digite o primeiro número: ");
        a = ler.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        b = ler.nextDouble();

        System.out.println("qual opção desejada? ");
        opcao = ler.nextInt();
        
        switch(opcao) {
        
        case 1: 
        	if(a%b == 0) {
        		System.out.println("Os números mencionados são multiplos um do outro!");
        
        	} else {
        		System.out.println("Os números mencionados não são multiplos! ");
        	}
        	
       
        	 
        		
        	
        	
        	
        }
    }
}