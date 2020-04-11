package pruebas;

public class Funciones {

	// Funcion 2
	/*
	 * Función que dada dos cadenas, diga cuál tiene más consonante. Debe hacerse
	 * una prueba con tu nombre y un apellido. Y otra prueba con tus dos apellidos.
	 */
	public static Boolean funcion2(String cadena, String cadena2) {
		int consonantes = 0;
		for (int x = 0; x < cadena.length(); x++) {
			char letra = cadena.charAt(x);
			if (consonantescadenas(letra)) {
				consonantes++;
			}
		}
		int consonantes2 = 0;
		for (int x = 0; x < cadena2.length(); x++) {
			char letra = cadena2.charAt(x);
			if (consonantescadenas(letra)) {
				consonantes2++;
			}
		}
		if (consonantes > consonantes2) {
			return true;
		} else if (consonantes < consonantes2) {
			return false;
		} else {
			return null;
		}
	}

	public static boolean consonantescadenas(char letra) {
		return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letra).toLowerCase());
	}
}
