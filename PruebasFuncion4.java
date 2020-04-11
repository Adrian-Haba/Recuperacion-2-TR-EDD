package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFuncion4 extends PreparacionPruebas{

	@DisplayName("Primera Prueba de Caja Negra Lista de numeros nula")
	@Test
	void prueba1() {
		int[] notas = new int[1];
		notas[0] = 13;
		assertNull(null, Funciones.funcion4(notas));
	}
	@DisplayName("Segunda Prueba de Caja Negra Lista de notas con varios valores")
	@Test
	//En esta prueba estan mis notas del segundo trimestre
	void prueba2() {
		int[] notas = new int[5];
		notas[0] = 8;
		notas[1] = 4;
		notas[2] = 4;
		notas[3] = 3;
		notas[4] = 9;
		assertEquals("suficiente", Funciones.funcion4(notas)); 
	}
	@DisplayName("Tercera Prueba de Caja Negra Lista de notas con un valor")
	@Test
	void prueba3() {
		int[] notas = new int[1];
		notas[0] = 5; 
		assertEquals("suficiente", Funciones.funcion4(notas)); 
	}
	@DisplayName("Cuarta Prueba de Caja Negra limite superior insuficiente")
	@Test
	void prueba4() {
		int[] notas = new int[4];
		notas[0] = 4;
		notas[1] = 4;
		notas[2] = 4;
		notas[3] = 4;
		assertEquals("insuficiente", Funciones.funcion4(notas)); 
	}
	@Test
	@DisplayName("Primera Prueba de Caja Blanca Cobertura Caminos Primer Camino")
	/*El primer camino es que si la nota media es entre 0 y 4.9 es insuficiente */
	void prueba5() {
		int[] notas = new int[5];
		notas[0] = 0;
		notas[1] = 1;
		notas[2] = 2;
		notas[3] = 3;
		notas[4] = 4;
		assertEquals("insuficiente", Funciones.funcion4(notas)); 
	}
	@Test
	@DisplayName("Segunda Prueba de Caja Blanca Cobertura Caminos Segundo Camino")
	/*El segundo camino es que si la nota media es entre 5 y 5.9 es suficiente */
	void prueba6() {
		int[] notas = new int[2];
		notas[0] = 5;
		notas[1] = 6;
		assertEquals("suficiente", Funciones.funcion4(notas)); 
	}
	@Test
	@DisplayName("Tercera Prueba de Caja Blanca Cobertura Caminos Tercer Camino")
	/*El tercer camino es que si la nota media es entre 6 y 6.9 es bien */
	void prueba7() {
		int[] notas = new int[2];
		notas[0] = 6;
		notas[1] = 7;
		assertEquals("bien", Funciones.funcion4(notas)); 
	}
	@Test
	@DisplayName("Cuarta Prueba de Caja Blanca Cobertura Caminos Cuarto Camino")
	/*El cuarto camino es que si la nota media es entre 7 y 8.9 es notable */
	void prueba8() {
		int[] notas = new int[2];
		notas[0] = 7;
		notas[1] = 9;
		assertEquals("notable", Funciones.funcion4(notas)); 
	}
	@Test
	@DisplayName("Quinta Prueba de Caja Blanca Cobertura Caminos Ultimo Camino")
	/*El ultimo camino es que si la nota media es entre 9 y 10 es sobresaliente */
	void prueba9() {
		int[] notas = new int[2];
		notas[0] = 9;
		notas[1] = 10;
		assertEquals("sobresaliente", Funciones.funcion4(notas)); 
	}
}
