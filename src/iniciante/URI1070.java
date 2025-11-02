package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1070 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int inicio = leitor.nextInt();
        int contador = 1;
        for(int i = 1; i <= inicio; i++){
            if (inicio % 2 == 1 && contador <=6){
                System.out.println(inicio);
                contador++;
            }
            inicio++;
        }

    }
}
