package mx.edu.uacm.aserciones.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;


public class IntroduccionHamcrestTest {

	private Logger log = Logger.
			getLogger(IntroduccionHamcrestTest.class);
	
	@Test
	public void testEjemploInicialHamcrest() {
		log.debug("Entrando a testEjemploInicialHamcrest");
		
		String cadena = "HolaMundo";
		
		//Si lo hago con assertEquals
		Assert.assertEquals("HolaMundo", cadena);
		
		//hamcrest
		Assert.assertThat(cadena, 
				is(equalTo("HolaMundo")));
		
		//Equals y Not Equals de Hamcrest
		Assert.assertThat(cadena, 
				equalTo("HolaMundo"));
		
		Assert.assertThat(cadena, 
				not(equalTo("Animo")));
		
		Assert.assertThat(cadena, 
				is(not(equalTo("Son jovenes"))));
		
		Assert.assertThat(cadena, 
				is(notNullValue()));
		
		Assert.assertThat(cadena, 
				is(not(nullValue())));
		
		
		
	}
}
