package com.exerciciojava.exercicioJava4;

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
        
        int op = 4, num1, num2, r1, r2, r3, r4;
        
        System.out.println("Digite o primeiro número: ");
        num1 = ler.nextInt();
        
        System.out.println("Digite o segundo número: ");
        num2 = ler.nextInt();
        
        System.out.println("Escolha qual operação deseja realizar, digite 1, 2, 3 ou 4: ");
        System.out.println(" 1 - Adição\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão\n");
        op = ler.nextInt();
        
        switch(op) {
        case 1: 
        	r1 = num1 + num2;
        	System.out.println("A o resultado da soma de " + num1 + " + "+ num2 + " é " + r1);
        	break;
        	
        case 2: 
        	r2 = num1 - num2;
        	System.out.println("A o resultado da subtração de " + num1 + " - "+ num2 + " é " + r2);
        	break;
        	
        case 3: 
        	r3 = num1 * num2;
        	System.out.println("A o resultado da multiplicação de " + num1 + " * "+ num2 + " é " + r3);
        	break;
        	
        case 4: 
        	r4 = num1 / num2;
        	System.out.println("A o resultado da divisão de " + num1 + "/ "+ num2 + " é " + r4);
        	break;
        }
        
    }
    
    
}