import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExPara {

	public static void main(String[] args) {
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		float numero,media, soma;
		int cont;
		soma = 0f;
		try {
			for (cont=0;cont<3; cont++) { //conpressão de operadores cont++ equivalente a cont = cont + 1
				System.out.println("digite o numero");
				numero = Float.parseFloat (entrada.readLine());
				soma = soma +numero;
			}
			media  = soma /cont;
			System.out.println("média ="+ media);
		}catch (Exception e) {
			System.out.println("Ocorreu um erro durante a  leitura");
		}
		
	}
	

}
