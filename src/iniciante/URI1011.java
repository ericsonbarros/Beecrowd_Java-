package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1011 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        float raio = leitor.nextFloat();
        double PI = 3.14159;
        double volume = (4/3.0) * PI * Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f%n", volume);

    }
}
