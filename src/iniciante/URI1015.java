package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1015 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new  Scanner(System.in);
        float x1 = leitor.nextFloat();
        float y1 = leitor.nextFloat();
        float x2 = leitor.nextFloat();
        float y2 = leitor.nextFloat();
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.printf("%.4f\n", distancia);
    }
}
