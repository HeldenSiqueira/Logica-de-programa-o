import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExEnquanto {
	public static void main(String[] args) {
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		float numero, media, soma;
		int cont;
		cont = 0;
		soma = 0f;
		try {
			while (cont <2) {
				System.out.println("digite o n�mero ");
				numero = Float.parseFloat (entrada.readLine());
				soma = soma + numero ;
				cont = cont + 1;
			}
			media = soma/cont;
			System.out.println(" a media � "+ media);
			
		}catch (Exception e) {
			System.out.println(" Ocorreu  um erro durante a leitura");
		}
				
	}
}
