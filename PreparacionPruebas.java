package pruebas;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

class PreparacionPruebas {

	static Funciones funcion = null;
	static int pruebasRealizadas = 0;

	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Preparando Tests");
		funcion = new Funciones();
	}

	@BeforeEach
	private void preparaPruebaEjecutar() {
		pruebasRealizadas++;
		System.out.println("Ejecutando test " + pruebasRealizadas);
	}

	@AfterEach
	private void terminadaPrueba() {
		System.out.println("Se ha ejecutado el test: " + pruebasRealizadas);
	}

	@AfterAll
	static void terminarPruebas() {
		System.out.println("Se ha terminado de ejecutar todas las pruebas, se han realizado un total de "
				+ pruebasRealizadas + " pruebas");
		funcion = null;
	}

}
