package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1014 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new  Scanner(System.in);
        int km = leitor.nextInt();
        float combustivel = leitor.nextFloat();
        float consumo = km / combustivel;
        System.out.printf("%.3f km/l\n", consumo);
    }
}
