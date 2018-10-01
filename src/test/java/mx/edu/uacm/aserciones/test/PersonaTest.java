package mx.edu.uacm.aserciones.test;

import org.junit.Assert;
import org.junit.Test;

import mx.edu.uacm.aserciones.Persona;

/**
 * Clase de prueba para la clase Persona
 * @author Sergio Mena
 *
 */
public class PersonaTest {

	@Test
	public void testPersona() {
		//given
		Persona personaEsperada = new Persona("Sergio", "Mena");
		Persona personaActual = new Persona("Sergio", "Mena");	
		//when
		
		//then
		
		Assert.assertEquals("Los objetos no fueron iguales", personaEsperada, personaActual);
	
	}
	
	
}
