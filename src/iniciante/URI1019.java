package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1019 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int tempo = leitor.nextInt();
        int tempoHora = tempo / 3600;
        tempo = tempo % 3600;
        int tempoMinuto = tempo / 60;
        tempo = tempo % 60;
        int tempoSegundo = tempo;
        System.out.println(tempoHora + ":" + tempoMinuto + ":" + tempoSegundo);
    }
}
