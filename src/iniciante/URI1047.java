package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1047 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int h1, m1, h2, m2, hm1, hm2, h24, resultado;
        h1 = leitor.nextInt();
        m1 = leitor.nextInt();
        h2 = leitor.nextInt();
        m2 = leitor.nextInt();
        hm1 = (h1 * 60) + m1;
        hm2 = (h2 * 60) + m2;
        h24 = 24 * 60;
        resultado = 0;

        if (hm2 > hm1) {
            resultado = hm2 - hm1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(resultado / 60), (resultado % 60));
        } else if (hm1 > hm2) {
            resultado = (h24 - hm1) + hm2;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(resultado / 60), (resultado % 60));
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",24, 0);
        }
    }
}
