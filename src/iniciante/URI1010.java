package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1010 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new  Scanner(System.in);
        int cod_p1 = leitor.nextInt();
        int num_p1 = leitor.nextInt();
        double var_uni_p1 = leitor.nextDouble();
        int cod_p2 = leitor.nextInt();
        int num_p2 = leitor.nextInt();
        double var_uni_p2 = leitor.nextDouble();
        double total = (num_p1 * var_uni_p1) + (num_p2 * var_uni_p2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
