package project.euler.desafio003;

public class Desafio3 {

	public static void main(String[] args) {

		long soma = 1;
		long numeroObjetivo = 600_851_475_143L;
		
		for (int numero = 0; numero < 10000; numero++) {
			if(ehNumeroPrimo(numero) && numeroObjetivo % numero == 0 ) {
				System.out.println(numero);
				soma *= numero;
			}
			
			if(soma == numeroObjetivo) {
				System.out.println("Objetivo atingido:" + soma);
				break;
			}
		}
	}

	public static boolean ehNumeroPrimo(int numero) {
		int divisor = 1;
		int ehDivisivel = 0;
		while (divisor <= numero) {
			if (numero % divisor == 0) {
				ehDivisivel++;
			}
			divisor++;
		}
		return ehDivisivel == 2;
	}
}
