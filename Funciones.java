package pruebas;

public class Funciones {

	// Funcion 4
	/*
	 * Función que dada una lista de notas, devuelva una cadena indicando si la nota
	 * media ha sido insuficiente(<5),suficiente(>=5 y <6),bien(>=6 y <7),
	 * notable(>=7 y <9) o sobresaliente(>=9 y 10).Debe hacerse una prueba con las
	 * notas obtenidas en el segundo trimestre.
	 */
	public static String funcion4(int[] notas) {
		int media = 0;
		for (int i = 0; i < notas.length; i++) {
			media = media + notas[i];
		}
		media = media / notas.length;

		if (media >= 0 && media <= 4) {
			return "insuficiente";
		} else if (media >= 5 && media < 6) {
			return "suficiente";
		} else if (media >= 6 && media < 7) {
			return "bien";
		} else if (media >= 7 && media < 9) {
			return "notable";
		} else if (media >= 9 && media <= 10) {
			return "sobresaliente";
		} else {
			
			return  null;
		}
	}
}