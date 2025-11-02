package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1003 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int var_a = leitor.nextInt();
        int var_b = leitor.nextInt();
        int soma = (var_a + var_b);
        System.out.println("SOMA = " + soma);
    }
}
