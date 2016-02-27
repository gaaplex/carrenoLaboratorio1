package laboratorio;

import java.util.Scanner;

public class AdivinarNumero {


	public static void main(String args[]) {

		int answer = (int) Math.floor((Math.random() * 100) + 1);// genera
																	// numero
																	// aleatorio
		// entre 0 y 101
		Scanner entrada = new Scanner(System.in);

		int guess = 0;
		int numguesses = 1;// COrrección en codigo de diagrama de flujo

		while (numguesses <= 7) {// MODIFICACION

			System.out.println("Ingrese el numero");
			guess = entrada.nextInt();

			if (guess < answer) {

				System.out.println("Numero muy bajo");

			} else {
				if (guess > answer) {

					System.out.println("Numero muy alto");

				} else {
					System.out.println("Usted ha adivinado");
					System.out.printf(" el numero es %d", answer);
					numguesses = 8;// MODIFICACION
				}

			}

			numguesses = numguesses + 1;
		}

		if (numguesses > 7) {
			System.out.println("Ha excedido el numero de veces permitidas");
			System.out.printf("El numero es %d", answer);

		}
	}// Fin main
}// Fin class

