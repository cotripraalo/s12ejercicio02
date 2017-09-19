/*
(Conversión de millas a kilómetros) Escribir un programa que muestre lo siguiente
dos mesas de lado a lado:
Millas        Kilometros   |   Kilometros     Millas
1             1.609        |   20             12.430
2             3.218        |   25             15.538
...
9             14.481       |   60             37.290
10            16.090       |   65             40.398
*/
package Exercicio_05_06;

import java.util.Scanner;

public class Exercicio_05_06 {

    public static void main(String[] args) {
        //Creando Scanner
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
       // Creando constante valor: numero de kilometros por millas 
		final double klm_por_millas = 1.609;

		// Inicio tabla de presentación
		System.out.println("Millas         Kilometros   |   Kilometros     Millas     ");

		// Crear y mostrar tablas
		for (int m = 1, k = 20; m <= 20 && k <= 130; m++, k += 5) {
			System.out.printf(
                                //formato
				"%-15d%-10.3f", m, (m * klm_por_millas));
			System.out.print("   |   ");
			System.out.printf(
				"%-15d%-6.3f\n", k, (k / klm_por_millas));
		}
        
    }
    
}
