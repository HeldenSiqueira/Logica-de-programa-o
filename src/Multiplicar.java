import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Multiplicar {

	public static void main(String[] args) {
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Qual numero 1?");
			int num1 = Integer.parseInt (entrada.readLine());
			System.out.println( "Qual numero 2?");
			int num2 = Integer.parseInt (entrada.readLine());
			multiplicar (num1, num2);
		
		}catch (Exception erro) {
			System.out.println("Ocorreu um erro de leitura");
		}
	}

	static void multiplicar(float A, float B) {
		float res;
		res = A * B;
		System.out.println(" " + res);

	}
}
