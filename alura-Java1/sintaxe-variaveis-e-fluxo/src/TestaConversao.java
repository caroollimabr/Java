
public class TestaConversao {
	
	public static void main(String[] args){
		double salario = 6270.50;
		int valor = (int) salario; //int pode armazenar até 2 bilhões 
		System.out.println(valor);
		
		long numeroGrande = 82390139912808L; //long armazena mais que 2 bilhões
		short valorPequeno = 2131; //guarda valor até 16 bits (32000)
		byte menorAinda = 127; // guarda valor até 127
		
		float pontoFlutuante = (float) 3.14;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2; //aparece esse valor 0.30000000000000004 quando usa double mesmo
		
		System.out.println(total);
	}
}

/*boolean	1 bit
byte	1 byte
short	2 bytes
char	2 bytes
int	4 bytes
float	4 bytes
long	8 bytes
double	8 bytes*/
