package pruebas;

public class Funciones {

	// Funcion 3
	/*
	 * Función que dada una lista de numeros, devuelva la suma de todos los que sean
	 * menores a tu edad pero mayores que la mitad de tu edad
	 */
	public static int funcion3(int[] num) {
		int suma = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 10 && num[i] <= 19) {
				suma += num[i];
			}
		}

		return suma;
	}
}