// Programa que registra el conteo de votos para las elecciones de alcalde
// en el municipio de Topaiti

package laboratorio;

import java.util.Scanner;

public class EleccionesAlcaldia {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		int Nmun;// Numero de municipios
		int Nalc;// Numero de alcaldes

		do {

			System.out.println("ingrese la cantidad de municipios");
			Nmun = entrada.nextInt();

			System.out.println("ingrese el numero de candidatos a la alcaldia");
			Nalc = entrada.nextInt();

			if (Nmun > 20 || Nalc > 20) {

				System.out
						.println("numero de alcaldes o municipios incorrecto");
			}
		} while (Nmun > 20 || Nalc > 20);

		int matrizA[][]; // Matriz que imprime el reporte de las votaciones
		matrizA = new int[Nmun][Nalc];

		int matrizT[][]; // Matriz transpuesta
		matrizT = new int[Nalc][Nmun];

		for (int i = 0; i < Nmun; i++) {

			for (int j = 0; j < Nalc; j++) {

				System.out
						.printf("numero de votos en el municipio %d, para el candidato %d es: ",
								i, j);
				matrizA[i][j] = entrada.nextInt();

			}

		}
		// ***********************************************muestra matriz

		System.out.print("Alcalde");

		for (int y = 0; y < Nalc; y++) {

			System.out.printf(" %8d", y);

		}

		System.out.println();

		for (int i = 0; i < Nmun; i++) {

			System.out.printf("Municipio %d:", i);

			for (int j = 0; j < Nalc; j++) {

				System.out.printf(" %5d ", matrizA[i][j]);
				if (Nalc == (j + 1)) {
					System.out.println();
				}

			}

		}

		// ***********************************************Suma las filas de la
		// matriz

		// Muestra el numero de votos en cada municipio

		for (int i = 0; i < Nmun; i++) {

			int sumatory = 0;// reinicia la suma en la i-esima fila
			int sumatory2 = 0;

			for (int j = 0; j < Nalc; j++) {

				if (j + 1 <= Nalc) {

					sumatory2 = matrizA[i][j];// asigna el valor en dado
												// elemento, a una variable int

					sumatory = sumatory + sumatory2;// incrementa el valor de la
													// suma

				}

			}

			System.out.printf("EL numero de  votos  en el municipio%d es %d",
					i, sumatory);
			System.out.println();

		}

		// ***********************************************Suma las filas de la
		// matriz

		// ***********************************************crear matriz
		// transpuesta

		for (int i = 0; i < Nalc; i++) {

			for (int j = 0; j < Nmun; j++) {

				matrizT[i][j] = matrizA[j][i];

			}

		}

		// ***********************************************crear matriz
		// transpuesta

		// ***********************************************Suma las filas de la
		// matriz transpuesta

		// Muestra el numero de votos por cada alcalde

		int sumatory3 = 0;
		int reemplazo = 0;
		int mayor = 0;

		for (int i = 0; i < Nalc; i++) {

			int sumatory = 0;// reinicia la suma en la i-esima fila
			int sumatory2 = 0;

			for (int j = 0; j < Nmun; j++) {

				if (j + 1 <= Nmun) {

					sumatory2 = matrizT[i][j];// asigna el valor en dado
												// elemento, a una variable int

					sumatory = sumatory + sumatory2;// incrementa el valor de la
													// suma

				}

				if (sumatory > reemplazo) {
					reemplazo = sumatory;
					mayor = i;

				}

			}

			sumatory3 = sumatory3 + sumatory;
			System.out.printf("EL numero de  votos  para el alcalde %d es %d",
					i, sumatory);

			System.out.println();
			System.out.println();

		}

		System.out.printf(
				"EL numero de  votos en el departamento de Topaiti   es %d",
				sumatory3);

		System.out.println();
		System.out.println();

		System.out.printf("El alcalde con mayor votacion es %d  con %d votos",
				mayor, reemplazo);

		System.out.println();
		System.out.println();

		int totaltotal = 0;
		totaltotal = (sumatory3 / 2) + 1;

		if (reemplazo >= totaltotal) {
			System.out.printf("El alcalde ganador es el numero %d ", mayor);
			System.out.println();

		} else {
			System.out.println("Los candidatos que pasan a segunda ronda son:");
			System.out.println();

			for (int i = 0; i < Nalc; i++) {

				int sumatory = 0;// reinicia la suma en la i-esima fila
				int sumatory2 = 0;

				for (int j = 0; j < Nmun; j++) {

					if (j + 1 <= Nmun) {

						sumatory2 = matrizT[i][j];// asigna el valor en dado
													// elemento, a una variable
													// int

						sumatory = sumatory + sumatory2;// incrementa el valor
														// de la suma

					}

					if (sumatory > reemplazo) {
						reemplazo = sumatory;
						mayor = i;

					}

				}

				sumatory3 = sumatory3 + sumatory;
				System.out.printf(
						"EL numero de  votos  para el alcalde %d es %d", i,
						sumatory);
				System.out.println();

			}

		}
		// ***********************************************Suma las filas de la
		// matriz transpuesta

	}
}// Fin class

