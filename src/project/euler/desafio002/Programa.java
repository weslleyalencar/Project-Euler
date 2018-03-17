package project.euler.desafio002;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);

		Integer indice = 1;
		Integer somaDosDoisUltimosNumeros = 0;
		Integer somaDosNumerosPares = 2;

		while (somaDosNumerosPares <= 4_000_000) {
			somaDosDoisUltimosNumeros = numeros.get(indice) + numeros.get(indice - 1);
			somaDosNumerosPares +=  somaDosDoisUltimosNumeros % 2 == 0 ? somaDosDoisUltimosNumeros : 0;
			numeros.add(somaDosDoisUltimosNumeros);
			indice++;
		}
		
		System.out.println(numeros);
		System.out.println(somaDosNumerosPares);

	}

}
