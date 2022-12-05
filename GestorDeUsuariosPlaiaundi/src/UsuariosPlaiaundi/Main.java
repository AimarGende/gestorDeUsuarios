
package UsuariosPlaiaundi;

import java.io.FileNotFoundException;

/**
 * @author Eñaut Agirre
 *
 */
public class Main {
	/**
	 * El programa principal que lanza la aplicación
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		GestorUsuariosApp gua = new GestorUsuariosApp();
		gua.run();
	}

}
