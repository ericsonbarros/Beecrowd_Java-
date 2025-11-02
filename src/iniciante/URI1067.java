package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1067 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cc = 0;
        while (cc < x){
            cc++;
            if (cc % 2 == 0){
                continue;
                } else {
                System.out.println(cc);
            }
        }
    }
}
