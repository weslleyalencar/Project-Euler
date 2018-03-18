package project.euler.desafio010;

public class Desafio10 {

	public static void main(String[] args) {

		long soma = 0;

		for (int i = 0; i <= 2_0000_000; i++) {
			if (ehNumeroPrimo(i)) {
				System.out.println(i);
				soma += i;
			}
		}

		System.out.println("Soma dos números primos abaixo de 2M = " + soma);

	}

	public static boolean ehNumeroPrimo(int numero) {

		if (numero == 0 || numero == 1) {
			return false;
		}

		for (int divisor = 2; divisor <= numero / 2; divisor++) {
			if (numero % divisor == 0) {
				return false;
			}
		}

		return true;
	}
}
