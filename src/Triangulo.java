import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Triangulo {
	public static void main(String[] args) {
		int a, b, c;
		BufferedReader entrada;
		entrada = new BufferedReader (new InputStreamReader(System.in));
		try {
			System.out.println("Lado A =");
			a = Integer.parseInt(entrada.readLine());
			System.out.println("Lado B =");
			b = Integer.parseInt(entrada.readLine());
			System.out.println("Lado C =");
			c = Integer.parseInt(entrada.readLine());

			if (a !=0 && b!= 0 && c!=0) { // teste de ciondicional para verificar  se os valores fornecidos formam um triangulo se for verdadeiro realizara outro teste linha 18
				if (a +b >c && a + c > b && b + c >a) {
					if( a != b && a != c && b != c) {
						//classificando o triângulo
						System.out.println("Esaleno");
					}else {
						if (a==b && b ==c) {
							System.out.println("Equilá1tero");
						}else {
							System.out.println("isosceles");
						}
					}

				}else {
					System.out.println("não forma um triangulo");

				}
	
			}else {
				System.out.println("não forma um triangulo");
				}

			} catch (Exception e) {
				System.out.println("Erro de leitura");
			}
	
	}
	}

