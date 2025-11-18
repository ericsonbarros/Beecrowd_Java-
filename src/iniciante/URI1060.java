package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1060 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int contador = 0;

        for (int i =0; i<6; i++) {
            double num = leitor.nextDouble();
            if (num > 0){
                contador++;
            }
        }
        System.out.println(contador + " valores positivos");
    }
}
