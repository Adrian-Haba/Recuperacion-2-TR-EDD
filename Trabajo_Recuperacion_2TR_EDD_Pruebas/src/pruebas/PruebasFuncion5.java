package pruebas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFuncion5 extends PreparacionPruebas{

	@DisplayName("Primera Prueba de Caja Negra numeros aleatorios")
	@Test
	void prueba1() {
		assertEquals(9, Funciones.funcion5("+",3,6));
	}
	@DisplayName("Segunda Prueba de Caja Negra valores vacios")
	@Test
	void prueba2() {
		assertEquals(0, Funciones.funcion5("", 0, 0));
	}
	@DisplayName("Tercera Prueba de Caja Negra con un caracter valido")
	@Test
	void prueba3() {
		assertEquals(25, Funciones.funcion5("*", 5, 5));
	}
	@DisplayName("Cuarta Prueba de Caja Negra con un caracter invalido")
	@Test
	void prueba4() {
		assertEquals(0, Funciones.funcion5(";", 5, 5));
	}
	@DisplayName("Primera Prueba de Caja Blanca Cobertura de caminos Primer Camino")
	@Test
	// El primer camino es que el caracter sea un +
	//1º Prueba con dia y mes de nacimiento: 8 de febrero///8,2
	void prueba5() {
		assertEquals(10, Funciones.funcion5("+", 8, 2));
	}
	@DisplayName("Segunda Prueba de Caja Blanca Cobertura de caminos Segundo Camino")
	@Test
	// El segundo camino es que el caracter sea un -
	//2º Prueba con dia y mes de nacimiento: 8 de febrero///8,2
	void prueba6() {
		assertEquals(6, Funciones.funcion5("-", 8, 2));
	}
	@DisplayName("Tercera Prueba de Caja Blanca Cobertura de caminos Tercer Camino")
	@Test
	// El tercer camino es que el caracter sea un *
	//3º Prueba con dia y mes de nacimiento: 8 de febrero///8,2
	void prueba7() {
		assertEquals(16, Funciones.funcion5("*", 8, 2));
	}
	@DisplayName("Cuarta Prueba de Caja Blanca Cobertura de caminos Ultimo Camino")
	@Test
	/* El ultimo camino es que si el caracter no corresponde, devuelva un 0. Aqui en vez de poner
	(+) para sumar, (-) para restar o (*) para multiplicar, pondremos otro caracter como (ç)*/
	void prueba8() {
		assertEquals(0, Funciones.funcion5("ç", 8, 2));
	}
	
}
