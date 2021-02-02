package supermarkt;

/**
 * Eine Klasse zum schreiben von eigenen Exceptions
 * @author Sebastian Ohlendorf
 * @version 1.0
 * @date 02.02.2021
 *
 */
public class SupermarktExceptions extends Exception{

	/**
	 * Konstruktor um ein eigenes Exceptionsobjekt zu erstellen
	 * @param s Übergebene Exception Nachricht als String
	 */
	public SupermarktExceptions(String s){
		super(s);
	}

}
