import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eximpar {
	public static void main(String[] args) {
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		int numero;
		try 
		{
			System.out.println("qual o numero?");
			numero = Integer.parseInt(entrada.readLine());
			if (numero % 2 == 1) { //a condicional avalia se o numero é impar ao verificar se o resto da divisão desse número por  é igual a 1
				//% é o operador que determina o resto da divisão e == é o operador que compara o resultado da operação por 1
				//operador = atribuição ==comparação de valores
				System.out.println("o numero é impar");
			}else {
				System.out.println("o numero é par");
			}
		}catch (Exception e) {
			System.out.println("ococrreu um erro durante a leiturra");
		}
				
	}
}
