package project.euler.desafio007;

public class Desafio7 {

	public static void main(String[] args) {

		int numero = 0, qtdeDeNumeroPrimo = 0;

		while (qtdeDeNumeroPrimo != 10_001) {
			numero++;
			if (ehNumeroPrimo(numero)) {
				qtdeDeNumeroPrimo++;
			}
		}
		
		System.out.println("Número:" +  numero);

	}

	public static boolean ehNumeroPrimo(Integer numero) {
		int ehDivisivel = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				ehDivisivel++;
			}
		}
		return ehDivisivel == 2;
	}

}
