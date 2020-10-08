import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExEntrada { //nome do programa
	public static void main(String[] args) {//indica bloco de instru��es que ser�o sequencialmente executadas quando o programa for requissitado pelo usu�rio
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));//variavel entrada � um objeto que permite a utiliza��o do m�todo para leitura
		
			String nome; // vari�vel nome do tipo sitring
			try { //bloco de tratamento de erros
				System.out.println("Qual o seu nome?");
				nome = entrada.readLine();// metodo readline para variavel receber valor que o usuario escreveu
				System.out.println("Que nome lindo " + nome);
			} catch(Exception e) {
		
		System.out.println("Ocorreu um erro durante a leitura!");
	}
}
}