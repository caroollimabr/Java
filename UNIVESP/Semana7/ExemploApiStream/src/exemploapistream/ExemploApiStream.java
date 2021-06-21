package exemploapistream;

// Inlustra a utilização de stream em java 
import java.util.*; 
import java.util.stream.*; 

public class ExemploApiStream 
{ 
public static void main(String args[]) 
{ 
	// cria uma lista de inteiros 
	List<Integer> numList1 = Arrays.asList(10,20,30,40); 

	// demonstração do método map  
	List<Integer> multiplica = numList1.stream().map(y -> y*y).collect(Collectors.toList()); 
	System.out.println("Resultado da multiplicação: "+multiplica); 

	// criar uma lista de strings 
	List<String> nomes = Arrays.asList("UNIVESP","USP","UNICAMP", "UNESP"); 

	// uso do método filter 
	List<String> resultado = nomes.stream().filter(s->s.startsWith("U")).collect(Collectors.toList()); 
	System.out.println("Resultado fo filtro: "+resultado); 

	// uso do método sorted 
	List<String> mostra = nomes.stream().sorted().collect(Collectors.toList()); 
	System.out.println("Resultado com o método sorted: "+mostra); 

	// cria uma lista de inteiros 
	List<Integer> numList2 = Arrays.asList(100,200,300,400,500); 

	// método collect retorna um conjunto 
	Set<Integer> multiplicaSet = numList2.stream().map(x->x*x).collect(Collectors.toSet()); 
	System.out.println("Resultado com o método collect: "+multiplicaSet); 

	// demonstração do método forEach 
	numList2.stream().map(x->x*x).forEach(y->System.out.println(y)); 
} 
} 
