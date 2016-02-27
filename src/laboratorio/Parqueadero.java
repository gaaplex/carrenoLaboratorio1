//PROGRAMA: gestion de parqueadero
//26.2.2016

package laboratorio;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Random;

public class Parqueadero {

	public static void main(String args[]) {

		int TPM;// tarifa por minuto
		int NumRandom;// genera numeros aleatorios del 1 al 30
		int NumRandom2;// genera numeros aleatorios del 30 al 59
		int Num_segundos = 0;
		int placa;// 4 numeros enteros
		int hora;
		int totalPuestosVacios = 0;
		int totalPlataDia = 0;
		int cerrado=0;

		Scanner entrada = new Scanner(System.in);// objeto de la clase scanner
		Random numeroAleatorio = new Random();// objeto de la clase random
		Calendar fecha = Calendar.getInstance();// objeto de la clase calendar

		int Hora_servicio = fecha.get(Calendar.HOUR_OF_DAY);// variable que
															// almacena la hora
															// de servicio
		if (Hora_servicio <= 6 || Hora_servicio >= 20)
			
		{
	 			 System.out.println("El parqueadero esta cerrado");
	 			   cerrado = 1;
 		}	
		
		if( cerrado == 0)
		
		{

		
		System.out.println("Ingrese la tarifa por minuto (TPM)");
		TPM = entrada.nextInt();

		// ********************************* Arreglos

		int Arreglo1[];// placa
		Arreglo1 = new int[86];

		int Arreglo2[];// hora de ingreso
		Arreglo2 = new int[86];

		// ********************************* Arreglos

					
				
		for (int i = 0; i <= 86; i++)

		{

			if (Hora_servicio >= 6 && Hora_servicio <= 19)// si el cliente
															// biene a la
															// hora de
															// servicio
															// permitida...
			{

				int SalirOEntrar;

				SalirOEntrar = 1 + numeroAleatorio.nextInt(4);

				if (SalirOEntrar != 2 || i == 0)

				{

					for (int u = 0; u < 86; u++)

					{
						if (Arreglo1[u] == 0) {

							totalPuestosVacios = totalPuestosVacios + 1;
						}

					}

					System.out.printf("En total quedan  %d puestos vacios",
							totalPuestosVacios);

					System.out.println();

					totalPuestosVacios = 0;

					System.out.println("A llegado un cliente a Parking - car");

					System.out.println("Ingrese la placa del automovil");
					placa = entrada.nextInt();

					Arreglo1[i] = placa;// anexa el cupo del carro a la
										// posicion del arreglo

					int continuar = 2002323;

					while (continuar == 2002323) {// Hay que incorporar TIME

						System.out.printf("Ir a la posición %d", i);// dice
																	// a que
																	// posicion
																	// dirigirse
						System.out.println();

						System.out
								.printf("presione  cualquier numero para continuar");// dice
																						// a
																						// que
																						// posicion
																						// dirigirse
						continuar = entrada.nextInt();
						System.out.println();

						Calendar fechaHora = Calendar.getInstance();// crea
																	// objeto
																	// de la
																	// clase
																	// Calendar
						hora = fechaHora.get(Calendar.MINUTE); // signa el
																// segundo
																// actual

						Arreglo2[i] = hora;// Anexa a la posicion la hora
											// correspondiente
						System.out.println();

					}

				} else {

					System.out
							.println("Va a salir un cliente de Parking - car");

					System.out.println("Ingrese la posicion del auto");
					int posicion = entrada.nextInt();

					Calendar fechaHora = Calendar.getInstance();// crea
																// objeto de
																// la clase
																// Calendar
					hora = fechaHora.get(Calendar.MINUTE); // signa el
															// segundo
															// actual

					int tiempo = hora - Arreglo2[posicion];
					Arreglo1[posicion] = 0;

					int pagar = (tiempo * TPM) + TPM;

					int plata = 0;

					while (pagar != plata) {
						System.out.printf("Usted   debe pagar:  %d", pagar);
						plata = entrada.nextInt();

						totalPlataDia = plata + totalPlataDia;

					}
					int pararGracias = 324243;
					while (pararGracias == 324243) {

						System.out.println("Gracias por usar Parking-car");
						System.out
								.printf("presione  cualquier numero para continuar");// dice
																						// a
																						// que
																						// posicion
																						// dirigirse
						pararGracias = entrada.nextInt();

					}

				}

				int NumRandom3;

				NumRandom = 1 + numeroAleatorio.nextInt(19);
				NumRandom2 = 20 + numeroAleatorio.nextInt((19) + 1);// genera
																	// numero
																	// entre
				NumRandom3 = 39 + numeroAleatorio.nextInt((20) + 1);// genera
																	// numero
																	// entre

				do {

					Calendar fechaSegundo = Calendar.getInstance();// crea
																	// objeto
																	// de la
																	// clase
																	// Calendar
					Num_segundos = fechaSegundo.get(Calendar.SECOND); // signa
																		// el
																		// segundo
																		// actual

					System.out.println("Esperando cliente...");

					System.out.println();

				} while (NumRandom != Num_segundos
						&& NumRandom2 != Num_segundos
						&& NumRandom3 != Num_segundos);

			}  

			}
		}

		if (Hora_servicio >= 20) // despues de las 20 se contabilizan los
									// ingresos diarios

		{

			System.out.printf(
					" EL dinero total recaudado en el dia es de:  %d",
					totalPlataDia);

		}

	}// End main

}// end Class

