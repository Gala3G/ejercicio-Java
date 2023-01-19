
public class CadenaCambioVocales {

	public static void main(String[] args) {

		String cadena = "qwertyuiopasdfghjklñzxcvbnm";
		String nuevaCadena = " ";
		String cambioFinal = " ";

		nuevaCadena = cadena;
		cambioFinal = nuevaCadena;

		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'e') {
				cambioFinal = cambioFinal.substring(0, i) + 'E' + nuevaCadena.substring(i + 1, nuevaCadena.length());
			}
			if (cadena.charAt(i) == 'a') {
				cambioFinal = cambioFinal.substring(0, i) + 'A' + nuevaCadena.substring(i + 1, nuevaCadena.length());
			}
			if (cadena.charAt(i) == 'i') {
				cambioFinal = cambioFinal.substring(0, i) + 'I' + nuevaCadena.substring(i + 1, nuevaCadena.length());
			}
			if (cadena.charAt(i) == 'o') {
				cambioFinal = cambioFinal.substring(0, i) + 'O' + nuevaCadena.substring(i + 1, nuevaCadena.length());
			}
			if (cadena.charAt(i) == 'u') {
				cambioFinal = cambioFinal.substring(0, i) + 'U' + nuevaCadena.substring(i + 1, nuevaCadena.length());
			}

		}

		System.out.println(cambioFinal);

	}

}
