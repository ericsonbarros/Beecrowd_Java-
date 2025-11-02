package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1036 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double var_a = leitor.nextDouble();
        double var_b = leitor.nextDouble();
        double var_c = leitor.nextDouble();
        double delta = Math.pow(var_b,2) - 4 * var_a * var_c;
        if (delta < 0 || var_a == 0 ) {
            System.out.println("Impossivel calcular");
        } else {
           double x = (-var_b + Math.sqrt(delta)) / (2 * var_a) ;
           double y = (-var_b - Math.sqrt(delta)) / (2 * var_a) ;
            System.out.printf("R1 = %.5f\n", x);
            System.out.printf("R2 = %.5f\n", y);
        }

    }
}
