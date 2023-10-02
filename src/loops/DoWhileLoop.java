package loops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		/*
		 * Do-While. Evalúa su expresión en la parte inferior del ciclo. POr lo tanto,
		 * las declaraciones dentro del bloque "do" siempre se ejecutan al menos una vez
		 */

		// Cuenta del 1 al 10
		int cuenta = 1;
		do {
			System.out.println(cuenta);
			cuenta++;
		} while (cuenta < 0); // Output: 1 (ya que se ejecutó al menos una vez

		/*
		 * Crear un programa para un cajero bancario - El programa me mostrará 4
		 * botones: 1. Consultar saldo. 2. Ingresar dinero 3. Retirar dinero 4. Salir. -
		 * Mostrar mensaje de bienvenida al usuario, darle contexto y solicitar que
		 * elija una opción (numero). - Mostrar al usuario la opcion que eligió y
		 * permitir que elija otra opción. - El usuario puede salir del progranma
		 * escribiendo 4 (Salir)
		 */

		System.out.println(
				"Bienvenido al banco Generation, elije cualquiera de las opciones, para ello escribe el numero de corresponda:");
		System.out.println("1. Consultar Saldo");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Retirar dinero");
		System.out.println("4. Salir");

		Scanner skner = new Scanner(System.in);
		int opcionSeleccionada;
		do {
			opcionSeleccionada = skner.nextInt();

			switch (opcionSeleccionada) {
			case 1:
				System.out.println("Consultar saldo");
				break;
			case 2:
				System.out.println("Ingresar dinero");
				break;
			case 3:
				System.out.println("Retirar dinero");
				break;
			case 4:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Elige una opcion válida");
				break;
			}
		} while (opcionSeleccionada != 4);

	}

}
