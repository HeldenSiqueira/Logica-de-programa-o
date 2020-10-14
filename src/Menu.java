import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {
	public static void main(String[] args) {
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("1 : Adi��o");
			System.out.println("2 : Subitra��o");
			System.out.println("3 : Multiplica��o");
			System.out.println("4 : Divis�o");
			System.out.println("Qual a opi��o desejada?");
			int opcao = Integer.parseInt(entrada.readLine());
			switch (opcao) {
			case 1:
				modAdicao();
				break;
			case 2:
				modSubtracao();
				break;
			case 3:
				modMultiplicacao();
				break;
			case 4:
				modDivisao();
				break;
			default:
				System.out.println("Fim do programa");

			}

		} catch (Exception erro) {
			System.out.println("Ocorreu um erro de leitura!");
		}
	}

	static void modAdicao() {
		BufferedReader entraSoma;
		entraSoma = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("qual o primeiro numero?");
			float numero1 = Float.parseFloat(entraSoma.readLine());
			System.out.println("Qual o segundo numero?");
			float numero2 = Float.parseFloat(entraSoma.readLine());
			float resultado = numero1 + numero2;
			System.out.println("Soma = " + resultado);
		} catch (Exception erro) {
			System.out.println("Ocorreu um erro de Leitura!");
		}
	}

	static void modSubtracao() {
		BufferedReader entraSubtracao;
		entraSubtracao = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("qual o primeiro numero?");
			float numero1 = Float.parseFloat(entraSubtracao.readLine());
			System.out.println("Qual o segundo numero?");
			float numero2 = Float.parseFloat(entraSubtracao.readLine());
			float resultado = numero1 - numero2;
			System.out.println("Subtra��o = " + resultado);
		} catch (Exception erro) {
			System.out.println("Ocorreu um erro de Leitura!");
		}
	}

	static void modMultiplicacao() {
		BufferedReader entraMultiplicacao;
		entraMultiplicacao = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("qual o primeiro numero?");
			float numero1 = Float.parseFloat(entraMultiplicacao.readLine());
			System.out.println("Qual o segundo numero?");
			float numero2 = Float.parseFloat(entraMultiplicacao.readLine());
			float resultado = numero1 * numero2;
			System.out.println("Multiplica��o = " + resultado);
		} catch (Exception erro) {
			System.out.println("Ocorreu um erro de Leitura!");
		}

	}

	static void modDivisao() {
		BufferedReader entraDivisao;
		entraDivisao = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("qual o primeiro numero?");
			float numero1 = Float.parseFloat(entraDivisao.readLine());
			System.out.println("Qual o segundo numero?");
			float numero2 = Float.parseFloat(entraDivisao.readLine());
			float resultado = numero1 / numero2;
			System.out.println("Divis�o = " + resultado);
		} catch (Exception erro) {
			System.out.println("Ocorreu um erro de Leitura!");
		}
	}
}
