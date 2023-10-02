package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 * CICLO WHILE Ejecuta continuamente un bloque de codigo hasta que se cumpla una
		 * condicion dada While(expresion){ bloque de codigo a ejecutar (contador -
		 * iterador) }
		 */
		/*
		 * int cuenta = 1; while(cuenta < 11) { System.out.println("La cuenta es de: " +
		 * cuenta); cuenta++; }
		 */

		int cuenta = 0;
		while (cuenta < 10) {
			cuenta++;
			System.out.println("La cuenta es de: " + cuenta);

		}

		/*
		 * Crear un programa que solicite al usuario un numero. Dicho numero será tomado
		 * como numero final de una cuenta. Dicha cuenta inicia en el 1. Debe mostrar en
		 * consola la cuenta del 1 hasta el numero proporcionado. 1. Importar un scanner
		 * e implementarlo. 2. Un mensaje para darle un contexto al usuario. 3.
		 * Almacenar el numero del usuario en una variable. 4. Guardar em variable un
		 * numero que inicia la cuenta (1). 5. Implementar un ciclo while. 6. Mostrar
		 * por consola el resultado.
		 */

		// 1. Crear e importar el scanner
		Scanner scanner = new Scanner(System.in);
		// 2.
		System.out.println("Escribe un número que servirá como número final de una cuenta");
		// 3.
		int numFinal = scanner.nextInt();
		// 4.
		int numInicial = 1;
		// 5.
		while (numInicial <= numFinal) {
			System.out.println("La cuenta va en " + numInicial);
			numInicial++;

		}
		scanner.close();

	}

}
