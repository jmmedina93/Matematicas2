/*
 * TestMatematicas.java
 */
 import java.util.Scanner;

public class TestMatematicas {
	
	public static void main (String args[]) {
		//Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Leemos el numero
		System.out.println("Introduce numero entero");
		int numero =sc.nextInt();
		System.out.printf("El numero %d es par: %b\n",numero,Matematicas.esPar(numero));
	}
}

