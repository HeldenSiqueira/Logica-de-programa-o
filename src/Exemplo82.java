
public class Exemplo82 {

	public static void main(String[] args) {
		int num [] = new int [7];
		num[0] = 9;
		num[1] = 1;
		num[2] = 3;
		num[3] = 2;
		num[4] = 7;
		num[5] = 5;
		num[6] = 4;
		bolha (num);
		for (int i = 0; i < num.length; i++)
			System.out.println(num [i]);
		

	}
	//void é utilizado pois é equivalente a um procedimento, isto é , ordena um conjunto de números mas,após seu procerssamento, nada é acrescentado á memoria do sistema
	//static é usado para torna-lo um método sem dependencias com objetosd
	public static void bolha (int numeros []) { // modificador public, pois é interessante que esse métopdo tenha máxima visibilidade, embora não obrigatorio
		final int n = numeros.length;
		int aux;
		for (int i = 0; i < n-1; i++) {
			for(int j = 0; j < n -1-i; j++) {
				if (numeros[j] > numeros [j+1]) {
					aux = numeros [j];
					numeros[j] = numeros [j +1] ;
					numeros[j + 1] = aux;
					
					
				}
			}
		}
	}

}
