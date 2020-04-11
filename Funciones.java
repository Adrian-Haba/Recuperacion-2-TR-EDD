package pruebas;

public class Funciones {

	// Funcion 5
	/*
	 * Función que dado dos números y un caracter, haga lo siguiente:
	 * 
	 * Si el caracter es "+": devuelve la suma del primero con el segundo Si el
	 * caracter es "-": devuelve la resta del primero con el segundo Si el caracter
	 * es "*": devuelve la multiplicación del primero con el segundo Cualquier otro
	 * caracter, devuelve 0. Debe hacerse al menos 3 pruebas con el día y mes de tu
	 * nacimiento.
	 */
	public static int funcion5(String caracter, int n1, int n2) {
		int resp = 0;
		String caractersuma = "+";
		String caracterresta = "-";
		String caractermulti = "*";

		if (caracter == caractersuma) {
			resp = n1 + n2;
		} else if (caracter == caracterresta) {
			resp = n1 - n2;
		} else if (caracter == caractermulti) {
			resp = n1 * n2;
		} else {
			resp = 0;
		}
		return resp;
	}
}