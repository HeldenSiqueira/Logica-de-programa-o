import java.io.BufferedReader;
import java.io.InputStreamReader;

// dada uma matriz de 6 linhas e 2 colunas de inteiros, calcular e exibir a média geométrica dos valores de cada uma das linhas


public class Exemplo66 {
	public static void main(String[] args) {
		int G [][] = new int [6] [2];
		double prod;
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for (int i = 0; i < 6 ; i++) {
				prod = 1;
				for ( int j = 0; j < 2; j++) {
					System.out.println( "Entre com valores de G-" + i +"," + j);
					G[i] [j] = Integer.parseInt(entrada.readLine());
					prod = prod * G [i] [j];
				}
				
				System.out.println("Linha-" + i + ":"+ Math.sqrt(prod));
				}
			}catch (Exception e) {
				System.out.println( "Ocorreu um erro durante a Leitura!");
		}
		
	}

}
