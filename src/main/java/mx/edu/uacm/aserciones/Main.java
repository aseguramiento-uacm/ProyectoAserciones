package mx.edu.uacm.aserciones;

import org.apache.log4j.Logger;

public class Main {
	
	private static Logger log = Logger.getLogger(Main.class);
	//ctlr + espacio
	public static void main(String[] args) {
		
		//primitivos
		int a = 2;
		int b = 4;
		
		log.debug("Primitivos -> " + (a==b));
		
		//objetos
		Persona personaA = new Persona("Sergio", "Perez");
		Persona personaB = new Persona("Sergio", "Perez");
		
		log.debug("Persona A -> " + personaA.toString());
		log.debug("Persona B -> " + personaB.toString());
		
		log.debug("Objetos -> " + (personaA == personaB));
		log.debug("Objetos -> " + personaA.equals(personaB));
		
		
		
		
	}

}
