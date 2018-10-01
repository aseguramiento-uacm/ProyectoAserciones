package mx.edu.uacm.aserciones;

import org.apache.log4j.Logger;

/**
 * Clase utilitaria
 * @author Sergio Mena
 *
 */
public class Utilidades {
	
	private Logger log = Logger.getLogger(Utilidades.class);
			
	public String concatenar(String uno, String dos) {
		//return uno.concat(dos);
		if(uno != null && dos != null) {
			 return uno.concat(" ").concat(dos);
		}
		return null;
	}
	
	/**
	 * Ejemplo "a", "b", "c" String array = {"a", "b", "c"}
	 * @param strings
	 * @return Arreglo de Strings
	 */
	public String[] getArrayStrings(String... strings) {
		
		log.debug("Entrando al metodo getArrayStrings()");
		
		String[] array = new String[strings.length];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = strings[i];
		}
		
		return array;
	}
	
	/**
	 * Devuelve true para numeros mayores que 10
	 * Devuelve false para numeros menores que 10
	 * @param num
	 * @return valor booleano
	 */
	public boolean esMayorQue10(int num) {
		
		if(num > 10) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
