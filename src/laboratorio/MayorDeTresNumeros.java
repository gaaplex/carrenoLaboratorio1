package laboratorio;

import java.util.Scanner;

public class MayorDeTresNumeros {

	// programa para determinar el mayor de 3 numeros
	// 8.2.2016

	public static void main(String args[]) {
		double mayor = 0;
		double a, b, c;

		Scanner entrada = new Scanner(System.in);

		System.out.println("ingrese a");
		a = entrada.nextDouble();

		System.out.println("ingrese b");
		b = entrada.nextDouble();

		System.out.println("ingrese c");
		c = entrada.nextDouble();

		if (a > b) {
			if (a > c) {
				mayor = a;
			} else {
				mayor = c;
			}

		} else {
			if (b > c) {
				mayor = b;

			} else {
				mayor = c;
			}
		}

		System.out.printf("El numero mayor es: %s", mayor);
	}// Fin main
}// Fin class

