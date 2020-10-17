import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exemplo72 {
	
	public static void main(String[] args) {
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("qual numerero");
			int numero = Integer.parseInt(entrada.readLine());
			int fat = fatorial(numero);
			System.out.println("fatorial = " + fat);

		}catch (Exception erro) {
			System.out.println("ocorreu um erro de leitura");
			
		}
	}
	static int fatorial(int num) {
		int fat = 1;
		for (int i = 1; i <= num; i++)
			fat = fat * 1;
		return fat;
	}
}
