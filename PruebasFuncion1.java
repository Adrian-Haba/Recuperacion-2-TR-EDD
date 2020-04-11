package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFuncion1 extends PreparacionPruebas {

	@Test
	@DisplayName("Primera Prueba Caja negra valor limite Inferior")
	void prueba1() {
		assertEquals(true, Funciones.funcion1("el ada es el mejor instituto del mundo y de europa"));
	}

	@Test
	@DisplayName("Segunda Prueba Caja negra valor limite Inferior -1")
	// En esta prueba estan mis nombres y apellidos
	void prueba2() {
		assertEquals(false, Funciones.funcion1("adrian haba gomez"));
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
		assertEquals(true, Funciones.funcion1("se cumple la condicion de que cadena es mayor a mi edad que es 19"));
	}

	@Test
	@DisplayName("Segunda Prueba de Test Caja Blanca Cobertura de Condiciones primera condicion incorrecta")
	/* No se cumple la condicion de cadena >= 19 */
	void prueba7() {
		assertEquals(false, Funciones.funcion1("la condicion no se cumpliria porque es menor a 19"));
	}

	@Test
	@DisplayName("Tercera Prueba de Test Caja Blanca Cobertura de Caminos 1")
	/* El primer camino es: cadena >= 19 */
	void prueba8() {
		assertEquals(true,
				Funciones.funcion1("el primer camnino seria que la suma de las vocales de la cadena es > a 19"));
	}

	@Test
	@DisplayName("Cuarta Prueba de Test Caja Blanca Cobertura de Caminos 2")
	/* El ultimo camino es: cadena < 19 */
	void prueba9() {
		assertEquals(false, Funciones.funcion1("el segundo camnino seria cadena < 19"));
	}

}
