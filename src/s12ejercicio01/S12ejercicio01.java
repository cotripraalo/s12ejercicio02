
package s12ejercicio01;

import java.util.Scanner;

public class S12ejercicio01 {

    public static void main(String[] args) {
        //Creando Scanner
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
       // Creando constante valor: numero de kilometros por millas 
		final double KILOMETERS_PER_MILE = 1.609;

		// Inicio tabla de presentación
		System.out.println("Millas         Kilometros   |   Kilometros     Millas     ");

		// Crear y mostrar tablas
		for (int m = 1, k = 20; m <= 20 && k <= 130; m++, k += 5) {
			System.out.printf(
                                //formato
				"%-15d%-10.3f", m, (m * KILOMETERS_PER_MILE));
			System.out.print("   |   ");
			System.out.printf(
				"%-15d%-6.3f\n", k, (k / KILOMETERS_PER_MILE));
		}
            }
    }
