import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PilasyColas {

	public static void main(String[] args) {

		int contador = 0;
		
		//de una lista, los que empiecen por vocal pásalo a una pila
		//los que empiecen por consonante, pasalos a una cola
		
		ArrayList<String> lista = new ArrayList<String>();
		Stack<String> pila = new Stack<String>();
		Queue<String> cola = new LinkedList<String>();

		// meter en lista
		lista.add("estuche");
		lista.add("lapiz");
		lista.add("aguja");
		lista.add("tenedor");
		System.out.println(lista.toString());
		// leer la lista y pasarla a cola o pila

		for (String string : lista) {
			if (string.charAt(0) == 'a' || string.charAt(0) == 'e') {
				pila.push(string);
			} else if (string.charAt(0) == 'i' || string.charAt(0) == 'o' || string.charAt(0) == 'u') {
				pila.push(string);
			} else {
				cola.offer(string);
			}
		}

		System.out.println(pila.toString());
		System.out.println(cola.toString());

	}

}
