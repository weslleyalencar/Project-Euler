package project.euler.desafio004;

public class Desafio4 {

	public static void main(String[] args) {

		int maiorPalindromo = 0;
		
		for (int i = 1; i <= 999; i++) {
			for (int j = 1; j <= 999; j++) {
				int produto = i * j;
				if(ehPolindromo(produto)) {
					if(produto > maiorPalindromo) {
						maiorPalindromo = produto;
					}
				}
			}
		}
		System.out.println(maiorPalindromo);
	}
	
	public static boolean ehPolindromo(Integer numero) {
		String numeroNormal = numero.toString();
		String numeroInvertido = new StringBuilder(numeroNormal).reverse().toString();
		return numeroNormal.equals(numeroInvertido); 
	}

}
