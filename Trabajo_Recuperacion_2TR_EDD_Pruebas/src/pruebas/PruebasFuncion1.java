package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFuncion1 extends PreparacionPruebas {

	@Test
	@DisplayName("Primera Prueba Caja negra valor limite Inferior")
	void prueba1() {
		assertEquals(true, Funciones.funcion1("El Ada es el mejor instituto del mundo y de Europa"));
	}

	@Test
	@DisplayName("Segunda Prueba Caja negra prueba aleatoria con caso negativo.")
	// En esta prueba estan mis nombres y apellidos
	void prueba2() {
		assertEquals(false, Funciones.funcion1("Adrián Haba Gómez"));
	}

	@Test
	@DisplayName("Tercera Prueba Caja Negra particion Equivalente grupo positivo")
	void prueba3() {
		assertEquals(true, Funciones.funcion1("supercalifragilispicuespialidoso supercalifragilispicuespialidoso"));
	}

	@Test
	@DisplayName("Cuarta Prueba Caja Negra particion Equivalente grupo negativo")
	void prueba4() {
		assertEquals(false, Funciones.funcion1("supercalifragilispicuespialidoso"));
	}

	@Test
	@DisplayName("Prueba Extra de Caja Negra Valor Vacio")
	void prueba5() {
		assertEquals(false, Funciones.funcion1(""));
	}

	@Test
	@DisplayName("Primera Prueba de Test Caja Blanca Cobertura de Condiciones primera condicion correcta")
	/* Se cumple la condicion de cadena >= 19 */
	void prueba6() {
		assertEquals(true, Funciones.funcion1("Se cumple la condición de que cadena es mayor a mi edad que es 19"));
	}

	@Test
	@DisplayName("Segunda Prueba de Test Caja Blanca Cobertura de Condiciones primera condicion incorrecta")
	/* No se cumple la condicion de cadena >= 19 */
	void prueba7() {
		assertEquals(false, Funciones.funcion1("La condición no se cumpliría porque es menor a 19"));
	}

	@Test
	@DisplayName("Tercera Prueba de Test Caja Blanca Cobertura de Caminos 1")
	/* El primer camino es: cadena >= 19 */
	void prueba8() {
		assertEquals(true,
				Funciones.funcion1("El primer camnino seria que la suma de las vocales de la cadena es > a 19"));
	}

	@Test
	@DisplayName("Cuarta Prueba de Test Caja Blanca Cobertura de Caminos 2")
	/* El ultimo camino es: cadena < 19 */
	void prueba9() {
		assertEquals(false, Funciones.funcion1("Si segundo camnino seria cadena < 19"));
	}

}
