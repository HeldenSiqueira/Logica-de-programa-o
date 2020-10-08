import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExRepita {

	public static void main(String[] args) {
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		float numero,media, soma;
		int cont;
		cont = 0;
		soma = 0f;
		try 
		{
			do {
				System.out.println("digite o numero");
				numero = Float.parseFloat (entrada.readLine());
				soma = soma +numero;
				cont = cont + 1;
			}while (cont < 5);
			media  = soma /cont;
			System.out.println("média ="+ media);

		}catch (Exception e) {
			System.out.println("Ocorreu um erro durante a  leitura");
		}
	}
}