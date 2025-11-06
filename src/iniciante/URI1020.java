package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1020 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new  Scanner(System.in);
        int tempo = leitor.nextInt();
        int tempoAnos = tempo / 365;
        tempo = tempo % 365;
        int tempoMeses = tempo / 30;
        tempo = tempo % 30;
        int tempoDias = tempo;
        System.out.println(tempoAnos + " ano(s)");
        System.out.println(tempoMeses + " mes(es)");
        System.out.println(tempoDias + " dia(s)");
    }
}
