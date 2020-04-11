package pruebas;

public class Funciones {

	// Funcion 1
	/*
	 * Función que cuenta el número de vocales de una cadena y diga si es mayor que
	 * tu edad. Debe hacerse una prueba con tu nombre y apellidos
	 */
	public static Boolean funcion1(String cadena) {
		int contador = 0;
		for (int x = 0; x < cadena.length(); x++) {
			if ((cadena.charAt(x) == 'a') || (cadena.charAt(x) == 'e') || (cadena.charAt(x) == 'i')
					|| (cadena.charAt(x) == 'o') || (cadena.charAt(x) == 'u')) {
				contador++;
			}
		}
		if (contador >= 19) {
			return true;
		} else {
			return false;
		}
	}
}