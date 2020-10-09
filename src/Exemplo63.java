import java.io.BufferedReader;
import java.io.InputStreamReader;

//soma dos números impares
public class Exemplo63 {
	public static void main(String[] args) {
		final int tamanho = 5;
		int vetor[] = new int[tamanho];
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for (int i = 0; i < tamanho; i++) {
				System.out.println("Qual o número?");
				vetor[i] = Integer.parseInt(entrada.readLine());

			}
			int soma = 0;
			for (int i = 0; i < tamanho; i++) {
				if (vetor[i] % 2 != 0)
					soma = soma + vetor[i];
			}
			// mostrando o conteudo dos dois vetores
			System.out.println();
			System.out.println("Soma = " + soma);

		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a leitura!");
		}
	}
}
