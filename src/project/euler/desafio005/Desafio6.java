package project.euler.desafio005;

import java.text.DecimalFormat;

public class Desafio6 {

	public static void main(String[] args) {

		double somaDosQuadrados = 0, quadradoDaSoma = 0;

		for (int numero = 0; numero <= 100; numero++) {
			somaDosQuadrados += Math.pow(numero, 2);
			quadradoDaSoma += numero;
		}

		quadradoDaSoma = Math.pow(quadradoDaSoma, 2);
		Double diferenca = quadradoDaSoma - somaDosQuadrados;
		DecimalFormat formatador = new DecimalFormat("#.##");

		System.out.println("Soma dos quadrados: " + somaDosQuadrados);
		System.out.println("Quadrado da soma: " + quadradoDaSoma);
		System.out.println("Diferença:" + formatador.format(diferenca));

	}
}
