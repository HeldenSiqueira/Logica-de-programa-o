import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex67 {

	public static void main(String[] args) {

		final int nProvas = 3;
		final int nAlunos = 30;
		float NotaProva[][] = new float[nAlunos][nProvas];
		float MedAlunos[] = new float[nAlunos];
		float MedProvas[] = new float[nProvas];
		float Soma;
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for (int i = 0; i < nAlunos; i++) {
				Soma = 0;
				for (int j = 0; j < nProvas; j++) {
					System.out.println("Entre com a nota do aluno - " + i + "Nota - " + j);
					NotaProva[i][j] = Float.parseFloat(entrada.readLine());
					Soma = Soma + NotaProva[i][j];
					MedAlunos[i] = Soma / nProvas;

				}

			}
			for (int j = 0; j < nProvas; j++) {
				Soma = 0;
				for (int i = 0; i < nAlunos; i++) {
					Soma = Soma + NotaProva[i][j];
					MedProvas[j] = Soma / nAlunos;
				}
			}
			for (int i = 0; i < nAlunos; i++) {
				System.out.println("media doas alunos -" + i + ";" + MedAlunos[i]);

			}
			for (int i = 0; i < nProvas; i++) {
				System.out.println("media da Prova- " + i + ":" + MedProvas[i]);

			}

		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a leitura!");
		}

	}
}
