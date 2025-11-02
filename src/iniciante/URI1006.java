package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1006 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double var_a =leitor.nextDouble();
        double var_b =leitor.nextDouble();
        double var_c =leitor.nextDouble();
        double media = (var_a * 2 + var_b * 3 + var_c * 5) / 10;
        System.out.println(String.format("MEDIA = %.1f", media));

    }
}
