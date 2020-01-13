package com.generation.idadeNadador;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Qual e a sua categoria?");
    	
        //declaracao de atributos
        int idade;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Digite a sua idade: ");
        idade = entrada.nextInt();
        
        if (idade >= 5 && idade <= 7) {
        	System.out.println("Infantil A");
        } else if (idade >= 8 && idade <= 11) {
        	System.out.println("Infantil B");
        } else if (idade >= 12 && idade <= 13){
        	System.out.println("Juvevnil A");
        } else if (idade >= 14 && idade <= 17){
        	System.out.println("Juvenil B");
        } else {
        	System.out.println("Adulto");
        }
        
    }
}
