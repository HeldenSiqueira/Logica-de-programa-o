
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
	//void � utilizado pois � equivalente a um procedimento, isto � , ordena um conjunto de n�meros mas,ap�s seu procerssamento, nada � acrescentado � memoria do sistema
	//static � usado para torna-lo um m�todo sem dependencias com objetosd
	public static void bolha (int numeros []) { // modificador public, pois � interessante que esse m�topdo tenha m�xima visibilidade, embora n�o obrigatorio
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
