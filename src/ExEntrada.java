import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExEntrada { //nome do programa
	public static void main(String[] args) {//indica bloco de instruções que serão sequencialmente executadas quando o programa for requissitado pelo usuário
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));//variavel entrada é um objeto que permite a utilização do método para leitura
		
			String nome; // variável nome do tipo sitring
			try { //bloco de tratamento de erros
				System.out.println("Qual o seu nome?");
				nome = entrada.readLine();// metodo readline para variavel receber valor que o usuario escreveu
				System.out.println("Que nome lindo " + nome);
			} catch(Exception e) {
		
		System.out.println("Ocorreu um erro durante a leitura!");
	}
}
}