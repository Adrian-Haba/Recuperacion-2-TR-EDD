package pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFuncion3 extends PreparacionPruebas {

	@DisplayName("Primera Prueba de Caja Negra Lista de numeros vacia")
	@Test
	void prueba1() {
		int[] num = new int[0];
		assertEquals(0, Funciones.funcion3(num));
	}

	@DisplayName("Segunda Prueba de Caja Negra limite superior")
	@Test
	void Prueba2() {
		int[] num = new int[1];
		num[0] = 19;
		assertEquals(19, Funciones.funcion3(num));
	}

	@DisplayName("Tercera Prueba de Caja Negra valor limite inferior")
	@Test
	void prueba3() {
		int[] num = new int[1];
		num[0] = 10;
		assertEquals(10, Funciones.funcion3(num));
	}

	@DisplayName("Cuarta Prueba de Caja Negra Lista de numeros con un valor fuera del rango")
	@Test
	void prueba4() {
		int[] num = new int[4];
		num[0] = 7;
		num[1] = 10;
		num[2] = 12;
		num[3] = 15;
		assertEquals(37, Funciones.funcion3(num));
	}

	@DisplayName("Primera Prueba de Caja Blanca Cobertura de sentencias")
	@Test
	/*
	 * En esta prueba se comprobará que los 4 numeros de la siguiente lista estén
	 * dentro del rango entre 10 y 19, por lo que todas las condiciones son verdad
	 */
	void prueba5() {
		int[] num = new int[4];
		num[0] = 13;
		num[1] = 15;
		num[2] = 17;
		num[3] = 12;
		assertEquals(57, Funciones.funcion3(num));
	}

	@DisplayName("Segunda Prueba de Caja Blanca Cobertura de Caminos Primer Camino ")
	@Test
	/* El primer camino es un numero solo en el rango */
	void prueba6() {
		int[] num = new int[4];
		num[0] = 10;
		num[1] = 23;
		num[2] = 2;
		num[3] = 4;
		assertEquals(10, Funciones.funcion3(num));
	}

	@DisplayName("Tercera Prueba de Caja Blanca Cobertura de Caminos Segundo Camino ")
	@Test
	/* El segundo camino son dos numeros solos en el rango y los otros dos fuera */
	void prueba7() {
		int[] num = new int[4];
		num[0] = 10;
		num[1] = 11;
		num[2] = 2;
		num[3] = 4;
		assertEquals(21, Funciones.funcion3(num));
	}

	@DisplayName("Cuarta Prueba de Caja Blanca Cobertura de Caminos Tercer Camino ")
	@Test
	/* El tercer camino son tres numeros en el rango y uno fuera */
	void prueba8() {
		int[] num = new int[4];
		num[0] = 10;
		num[1] = 15;
		num[2] = 12;
		num[3] = 4;
		assertEquals(37, Funciones.funcion3(num));
	}

	@DisplayName("Quinta Prueba de Caja Blanca Cobertura de Caminos Cuarto Camino ")
	@Test
	/* El cuarto camino son los cuatro numeros en el rango */
	void prueba9() {
		int[] num = new int[4];
		num[0] = 10;
		num[1] = 15;
		num[2] = 12;
		num[3] = 14;
		assertEquals(51, Funciones.funcion3(num));
	}

	@DisplayName("Sexta Prueba de Caja Blanca Cobertura de Caminos Ultimo Camino ")
	@Test
	/* El ultimo camino son todos los numeros fuera del rango */
	void prueba10() {
		int[] num = new int[4];
		num[0] = 0;
		num[1] = 5;
		num[2] = 32;
		num[3] = 43;
		assertEquals(0, Funciones.funcion3(num));
	}

}
