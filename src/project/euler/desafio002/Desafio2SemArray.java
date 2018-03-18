package project.euler.desafio002;

public class Desafio2SemArray {

	public static void main(String[] args) {
		
		int somaDosNumerosPares = 0, penultimoNumero = 0, ultimoNumero = 1, somaDosDoisUltimos = 0;

		while (somaDosNumerosPares <= 4_000_000) {
			somaDosDoisUltimos = ultimoNumero + penultimoNumero;
			somaDosNumerosPares += somaDosDoisUltimos % 2 == 0 ? somaDosDoisUltimos : 0;
			penultimoNumero = ultimoNumero;
			ultimoNumero = somaDosDoisUltimos;
			System.out.println(somaDosDoisUltimos);
		}
		System.out.println("Soma dos números pares: " + somaDosNumerosPares);
	}
}
