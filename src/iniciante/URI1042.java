package iniciante;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1042 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int num[] = new int[3];
        num[0] = leitor.nextInt();
        num[1] = leitor.nextInt();
        num[2] = leitor.nextInt();
        int[] copy = Arrays.copyOf(num, num.length);
        Arrays.sort(copy);
        for (int ordem : copy) {
            System.out.println(ordem);
        }
        System.out.println();
        for (int valor : num) {
            System.out.println(valor);
        }
    }
}
