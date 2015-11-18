/**@author Juan Martinez
 * @version 0.0
 */


public class Matematicas {
	/**metodo que devuelve si un numero es par o no
	 * @param par entero
	 * @return boolean 
	 * */
	public static boolean esPar (int par) {
		
		return par % 2 == 0;
	}
	/**metodo que devuelve si es divisible por 3 un numero
	 * @param par entero
	 * @return boolean 
	 * */
	public static boolean esDivisiblePor3 (int par) {
		
		return par % 3 == 0;
	}
	/**metodo que devuelve si es divisible por 5 un numero
	 * @param par entero
	 * @return boolean 
	 * */
	public static boolean esDivisiblePor5 (int par) {
		
		return par % 5 == 0;
	}
}

