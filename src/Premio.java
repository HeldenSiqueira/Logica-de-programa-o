import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Premio {

	public static void main(String[] args) {
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		float salario, bonus; //float tipo real
		int tempo;
		try {
			System.out.println("salario?");
			salario = Float.parseFloat(entrada.readLine()); //  Float.parseFloat e Integer.parseInt faz a leitura dos valores
			System.out.println("quanto tempo esta na empresa?");
			tempo = Integer.parseInt(entrada.readLine());
			
			if(tempo>=5) {
				bonus = salario * 0.20f; // 0.20f o f no final garante que a resposta sera do tipo float
			
			}else {
				bonus = salario * 0.10f;
			}
			System.out.println(" o valor do bonus é" + bonus);
			
		}catch (Exception e) {
			System.out.println("ococrreu um erro durante a leiturra");
		}

	}

}
