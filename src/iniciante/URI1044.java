package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1044 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int num_1 = leitor.nextInt();
        int num_2 = leitor.nextInt();
        if(num_2 % num_1 == 0 || num_1 % num_2 == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
