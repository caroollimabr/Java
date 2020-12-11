import java.util.Scanner;

public class Idade {
    public static void main (String[]args){
        int anos, meses, dias, totaldias;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade em anos completos: ");
        anos = input.nextInt();
        System.out.println("Digite sua idade em meses (excetuando os anos completos): ");
        meses = input.nextInt();
        System.out.println("Digite a sua idade em dias (excetuando os anos e meses completos): ");
        dias = input.nextInt();

        totaldias = (anos * 365) + (meses * 30) + dias;

        System.out.printf("Sua idade em dias é %d", totaldias);
    }
}
