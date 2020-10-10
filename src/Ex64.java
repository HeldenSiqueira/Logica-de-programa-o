//Calcula média adas temperaturas verificadas durante a semana a partir das médias diárias já obtidas.
public class Ex64 {
	public static void main(String[] args) {
		final int diasSemana= 7;
		float temperatura [] = new float [diasSemana];
		temperatura [0] =19.0f;
		temperatura [1] =23.0f;
		temperatura [2] =21.0f;
		temperatura [3] =25.0f;
		temperatura [4] =22.0f;
		temperatura [5] =20.0f;
		temperatura [6] =24.0f;
		float soma = 0f, media;
		for (int i=0; i < diasSemana; i++) {
			soma = soma + temperatura[i];
		}
		media = soma/diasSemana;
		System.out.println();
		System.out.println("Média da semana = " +media);
			
	}

}
