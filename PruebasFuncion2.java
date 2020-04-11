package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFuncion2 extends PreparacionPruebas {

	@Test
	@DisplayName("Primera Prueba de Caja Negra Cadenas Vacias")
	void prueba1() {
		assertEquals(null, Funciones.funcion2("", ""));
	}

	@Test
	@DisplayName("Segunda Prueba de Caja Negra Cadenas Aleatorias")
	void prueba2() {
		assertEquals(true, Funciones.funcion2("me encanta las galletas de chocolate", "me encantan los animales"));
	}

	@Test
	@DisplayName("Tercera Prueba Caja Negra particion Equivalente grupo positivo")
	void prueba3() {
		assertEquals(true, Funciones.funcion2("supercalifragilispicuespialidoso", "superheroe"));
	}

	@Test
	@DisplayName("Cuarta Prueba Caja Negra particion Equivalente grupo negativo")
	void prueba4() {
		assertEquals(false, Funciones.funcion2("superheroe", "supervillano"));
	}

	@Test
	@DisplayName("Primera Prueba de Caja Blanca Cobertura Decisiones Primera Decision")
	/*
	 * La primera decision: la primera cadena será mayor a la segunda en cuanto a
	 * consonantes
	 */
	void prueba5() {
		assertEquals(true, Funciones.funcion2("supercalifragilispicuespialidoso", "vivan las palomas"));
	}

	@Test
	@DisplayName("Segunda Prueba de Caja Blanca Cobertura Decisiones Primera Decision")
	/*
	 * La segunda decision: la segunda cadena será mayor a la primera en cuanto a
	 * consonantes
	 */
	void prueba6() {
		assertEquals(false, Funciones.funcion2("tengo la ps4", "tengo una television un armario y un ordenador"));
	}

	@Test
	@DisplayName("Tercera Prueba de Caja Blanca Cobertura Caminos Primer Camino")
	/*
	 * El primer camino dirá si la primera cadena es mayor a la segunda en
	 * consonantes
	 */
	// En esta prueba estan mi nombre y un apellido
	void prueba7() {
		assertEquals(true, Funciones.funcion2("adrian", "haba"));
	}

	@Test
	@DisplayName("Cuarta Prueba de Caja Blanca Cobertura Caminos Segundo Camino")
	/*
	 * El segundo camino dirá si la primera cadena es menor a la segunda en
	 * consonantes
	 */
	// En esta prueba estan mis dos apellidos
	void prueba8() {
		assertEquals(false, Funciones.funcion2("haba", "gomez"));
	}

	@Test
	@DisplayName("Quinta Prueba de Caja Blanca Cobertura Caminos Ultimo Camino")
	/*
	 * El ultimo camino dirá si la primera cadena es igual a la segunda en
	 * consonantes
	 */
	void prueba9() {
		assertEquals(null, Funciones.funcion2("hola", "hola"));
	}
}
