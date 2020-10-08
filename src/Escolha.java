import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Escolha {

	public static void main(String[] args) {
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		int codigo;
		try {
			System.out.println("digite o código: ");
			codigo = Integer.parseInt(entrada.readLine());
			switch (codigo) {
			case 001: System.out.println("caderno");
				break;
			case 002: System.out.println("Lápis");
				break;
			case 003: System.out.println("Borracha");
				break;
			
			
			default: System.out.println("diversos");
				
			}
		}catch (Exception e) {
			System.out.println("Ocorreu um erro de leitura");
		}
				
	}
}

