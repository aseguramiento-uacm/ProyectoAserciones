package mx.edu.uacm.aserciones.test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import java.sql.Connection;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import mx.edu.uacm.aserciones.ConexionBD;

public class ConexionBDTest {
	
	private ConexionBD conexion;
	
	@Ignore
	@Test
	public void testFailConnectionBD() {
		
		conexion = new ConexionBD();
		
		Connection conn = conexion.getConnection();
		
		if(conn == null) {
			Assert.fail("Ha fallado la conexion con la BD");
		}
		
		Assert.assertThat(conn, is(notNullValue()));
		
	}

}
