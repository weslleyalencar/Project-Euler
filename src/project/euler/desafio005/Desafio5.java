package project.euler.desafio005;

public class Desafio5 {

	public static void main(String[] args) {

		int numero = 0;
		int divisivel = 0;

		while (divisivel != 20) {
			divisivel = 0;
			numero++;
			for (int dividor = 1; dividor <= 20; dividor++) {
				if (numero % dividor != 0) {
					break;
				}
				divisivel++;
			}
		}

		System.out.println("Número:" + numero);

	}

}
