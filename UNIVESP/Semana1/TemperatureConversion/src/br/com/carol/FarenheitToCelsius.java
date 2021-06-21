package br.com.carol;

import java.util.Scanner;

public class FarenheitToCelsius {
    public static void main(String[] args) {
        float temperatureCelsius1, temperatureFarenheit1;

        Scanner scan = new Scanner(System.in);
        System.out.println("\n Digite a temperatura em Farenheit: ");

        temperatureFarenheit1 = scan.nextFloat();

        // conversão
        temperatureCelsius1 = (temperatureFarenheit1 - 32) * 5/9;

        System.out.println("\n Essa temperatura equivale a " + temperatureCelsius1 + " C.");



    }
}
