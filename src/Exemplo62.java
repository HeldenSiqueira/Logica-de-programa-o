import java.io.BufferedReader;
import java.io.InputStreamReader;

//Se o fvalor do indice for par , o valor do elemento deverá ser multiplicado por 5 ; se impar deve ser somado com 5
public class Exemplo62 {
 public static void main(String[] args) {
	int teste1 [] = new int [10];
	int teste2 [] = new int [10];
	BufferedReader entrada;
	entrada = new BufferedReader(new InputStreamReader(System.in));
	
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Qual o número?");
				teste1[i] = Integer.parseInt(entrada.readLine());
				
			}
			for (int i = 0; i < 10; i++) {
				if(i % 2 == 0)
					
				teste2[i] = teste1[i] * 5;
				else
				teste2[i] = teste1[i] + 5;
				
			}
			//mostrando o conteudo dos dois vetores
			System.out.println();
			System.out.println("Resultado");
			for (int i = 0; i < 10; i++) {
				System.out.println("teste1[" + i + "] = " + teste1[i] + "\t");
				System.out.println("teste2[" + i + "] = " + teste2[i]);
			}
				
				
			}catch (Exception e) {
				System.out.println("Ocorreu um erro durante a leitura!");
			}
		
	
 	}
}
