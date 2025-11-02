package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1005 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        //leitor.useLocale(java.util.Locale.US);
        double var_a = leitor.nextDouble();
        double var_b = leitor.nextDouble();
        double peso_a = 3.5;
        double peso_b = 7.5;
        double soma_pesos = peso_a + peso_b;
        double media = (var_a * peso_a + var_b * peso_b) / soma_pesos;
        System.out.printf("MEDIA = %.5f\n", media);
    }
}
