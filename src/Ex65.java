
public class Ex65 {
 public static void main(String[] args) {
	 final int diasSemana = 7;
	 float temperatura [] = new float [diasSemana];
		temperatura [0] =19.0f;
		temperatura [1] =23.0f;
		temperatura [2] =21.0f;
		temperatura [3] =25.0f;
		temperatura [4] =22.0f;
		temperatura [5] =20.0f;
		temperatura [6] =24.0f;
		float aux;
		int min;
		for ( int i = 0; i < diasSemana - 1; i++) {
			min = i;
		
		for (int j = i + 1; i < diasSemana -1; i++ ) {
			if ( temperatura[j] < temperatura[min]) {
				min = j;
				aux = temperatura[min];
				temperatura[min] = temperatura[i];
				temperatura[i] = aux;
			}
		}
	
}System.out.println();
System.out.println("M�nima da semana = " + temperatura[0]);
System.out.println("M�xima da semana = " + temperatura[6]);
 }
}
