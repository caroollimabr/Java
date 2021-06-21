package br.com.carol;
import java.util.Scanner;

public class CelsiusToFarenheit {

    public static void main(String[] args) {
	    float temperatureCelsius, temperatureFarenheit;

	    Scanner scan = new Scanner(System.in);
	    System.out.println("\n Digite a temperatura em Celsius: ");

	    temperatureCelsius = scan.nextFloat();

	    // conversão
	    temperatureFarenheit = temperatureCelsius * 9/5 + 32;

        System.out.println("\n Essa temperatura equivale a " + temperatureFarenheit + " F.");



    }
}
