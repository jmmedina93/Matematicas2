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
		System.out.printf("El numero %d es divisible por 3: %b\n",numero,Matematicas.esDivisiblePor3(numero));
		System.out.printf("El numero %d es divisible por 5: %b\n",numero,Matematicas.esDivisiblePor5(numero));
	}
}

