import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main (String[]args){
        int totalDias, anos, meses, dias;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade em dias:");
        totalDias = input.nextInt();

        anos = totalDias / 365;
        meses = (totalDias%365)/30;
        dias = meses%30;

        System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias de idade.");
    }
}
