package Caso2;

import java.security.PublicKey; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class MainCaso2 {

	public static void main(String[] args) {

		// creo la lista de productos del sistema
		ArrayList<productos> lista = new ArrayList<productos>();
		ArrayList<productos> tipo = new ArrayList<productos>();
		Scanner lector = new Scanner(System.in);
		String producto;
		int contador = 0;

		productos producto1 = new productos("limpieza", 2, "detergente");
		productos producto2 = new productos("limpieza", 3, "limpia cristales");
		productos producto3 = new productos("comida", 2, "tomate");
		productos producto4 = new productos("comida", 1, "patatas");
		productos producto5 = new productos("limpieza", 6, "spray para sofas");
		productos producto6 = new productos("comida", 3, "coliflor");

		producto1.guardar(lista, producto1);
		producto1.guardar(lista, producto2);
		producto1.guardar(lista, producto3);
		producto1.guardar(lista, producto4);
		producto1.guardar(lista, producto5);
		producto1.guardar(lista, producto6);

		System.out.println("-----1. PRODUCTOS SEGUN RANGO DE PRECIO------------");
		System.out.println("Estos son los productos que hay");
		leerPrecios(1, 5, lista);

		System.out.println("-----2. SACAR UN PRODUCTO AL AZAR--------------");
		Collections.shuffle(lista);
		System.out.println("Producto al azar de " + lista.get(0).getTipo());
		System.out.println(lista.get(0).getNombre());
		System.out.println(lista.get(0).getPrecio() + " euros");

		System.out.println("-----3. MOSTRAR PRODUCTO SEGUN TIPO------------");
		System.out.println("Dime un tipo de producto");
		producto = lector.nextLine();

		for (int j = 0; j < lista.size(); j++) {
			if (producto == lista.get(j).getTipo()) {
				System.out.println("Si esta");
			}
		}

	}

	// metodo pregunta 1
	public static void leerPrecios(int uno, int dos, ArrayList<productos> lista) {
		int precio;
		for (productos productos : lista) {
			precio = productos.getPrecio();
			if (precio >= uno && precio <= dos) {
				System.out.println(productos.getTipo() + ": " + productos.getNombre() + " por " + productos.getPrecio()
						+ " euros");
			}
		}

	}

	// metodo pregunta 3
	// para mostrar solo una vez el tipo, tengo que crear una nueva lista
	// con solo un tipo de cada
	// 1. tengo que leer la lista
	// Tengo que coger uno de la lectura total
	// 2. tengo que crear una nueva lista con 1 de cada una
	// 3. tengo que mostrar la nueva lista

	public static boolean validarSiEsta(ArrayList<productos> lista, ArrayList<productos> tipo) {
		String busqueda = " ";
		int indice = 0;
		boolean valido = false;

		// veo a ver si lo tiene

		for (int i = 0; i < lista.size(); i++) {

			if (!tipo.contains(lista.get(i).getTipo())) {
				valido = true;
				System.out.println("No esta");
				tipo.add(lista.get(i));
			}
		}

		return valido;

	}

	public static void añadirTipo(ArrayList<productos> lista, ArrayList<productos> tipo) {
		for (int i = 0; i < lista.size(); i++) {

			if (!tipo.contains(lista.get(i).getTipo())) {
				tipo.add(lista.get(i));
			}

		}
	}

	public static void mostrarTipos(ArrayList<productos> lista) {

		for (productos productos : lista) {

		}
	}

}
