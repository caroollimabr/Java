package com.exerciciojava.exercicioJava3;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Scanner ler = new Scanner(System.in);
       
       int numeros, a, b;
       
       int rep = 1;
       
       while(rep == 1) {
    	   
       System.out.println("Digite qualquer número positivo ou negativo");
       numeros = ler.nextInt();
       
       if(numeros < 0) {
    	   a = numeros;
    	   System.out.println("numeros A: " + a);
       } else {
    	   b = numeros;
    	   System.out.println("numeros B: " + b);
       }
       		System.out.println("Deseja acrescentar mais um número? Se sim, responda 1, se não responda 2.");
       		rep = ler.nextInt();
         	   
       }
    }

}
