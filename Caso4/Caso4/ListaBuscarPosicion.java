package Caso4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaBuscarPosicion {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();
		Scanner lector = new Scanner(System.in);
		int numero;
		int contador = 0;
		boolean validar = false;

		for (int i = 0; i < 10; i++) {
			lista.add(i);
		}

		Collections.shuffle(lista);
		System.out.println(lista.toString());

		System.out.println("Dime un numero");
		numero = lector.nextInt();

		if (lista.contains(numero)) {
			System.out.println("Si, está");
		} else {
			System.out.println("No, no está");
		}
		while (contador < lista.size() && !validar) {
			if (lista.get(contador) == numero) {
				validar = true;
			}
			contador++;
		}
		if (validar == true) {
			System.out.println("Sí, está en la posicion " + contador);
		} else {
			System.out.println("No, no está ");
		}

	}

}
