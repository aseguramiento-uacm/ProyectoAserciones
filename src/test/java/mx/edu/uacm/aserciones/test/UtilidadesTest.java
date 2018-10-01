package mx.edu.uacm.aserciones.test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import mx.edu.uacm.aserciones.Utilidades;

/**
 * Clase de prueba para utilidades
 * @author Sergio Mena
 *
 */
public class UtilidadesTest {

	private Logger log = Logger.getLogger(UtilidadesTest.class);
	
	@Test
	public void testArreglo() {
		log.debug("Iniciando prueba testArreglo");
		
		//given
		//Instanciar lo que debemos probar
		Utilidades utilidades = new Utilidades();
		//ejecutar el metodo a probar
		String[] arregloActual = 
				utilidades.getArrayStrings("a", "b", "c");
		String[] arregloEsperado = {"a", "b", "c"};
		
		//Utilizar la asercion
		Assert.assertArrayEquals(arregloEsperado, 
				arregloActual);
		
	}
	
	@Test
	public void testAserciontTrue() {
		
		Utilidades utils = new Utilidades();
		
		boolean resultadoTrue = utils.esMayorQue10(11);
		boolean resultadoFalse = utils.esMayorQue10(5);
		
		Assert.assertTrue("La asercion fallo para verdadero", resultadoTrue);
		Assert.assertFalse("La asercion fallo para falso", resultadoFalse);
		
	}
}
