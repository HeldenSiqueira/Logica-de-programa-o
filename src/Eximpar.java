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
			if (numero % 2 == 1) { //a condicional avalia se o numero � impar ao verificar se o resto da divis�o desse n�mero por  � igual a 1
				//% � o operador que determina o resto da divis�o e == � o operador que compara o resultado da opera��o por 1
				//operador = atribui��o ==compara��o de valores
				System.out.println("o numero � impar");
			}else {
				System.out.println("o numero � par");
			}
		}catch (Exception e) {
			System.out.println("ococrreu um erro durante a leiturra");
		}
				
	}
}
