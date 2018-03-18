package project.euler.desafio009;

import java.text.DecimalFormat;

public class Desafio9 {

	public static void main(String[] args) {

		for (int a = 1; a < 1000; a++) {
			for (int b = 1; b < 1000; b++) {
				double quadrado = Math.pow(a, 2) + Math.pow(b, 2);
				double c = Math.sqrt(quadrado);

				if (a + b + c == 1000) {
					System.out.println(new DecimalFormat("#.##").format(a * b * c));
				}
			}
		}

	}

}
