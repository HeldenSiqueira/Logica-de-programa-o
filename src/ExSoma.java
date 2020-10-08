import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExSoma {

	public static void main(String[] args) {
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		int valor1, valor2, soma; //declarados 3 variaveis do tipo inteiro
		try {
			System.out.println("qual o primeiro valor ?");
			valor1 = Integer.parseInt(entrada.readLine()); //Integer.parseInt recebe os valores lidos no console  na forma de texto e converte os numeros para inteiros
			System.out.println("qual o segundo valor ?");
			valor2 = Integer.parseInt(entrada.readLine());
			soma = valor1 + valor2;
			System.out.println("a resposta é " + soma);
		}catch (Exception e) {
			System.out.println("Ocorreu um erro durante a leitura");
		}

	}

}
