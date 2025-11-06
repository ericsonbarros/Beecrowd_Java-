package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1018 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int valor = leitor.nextInt();
        System.out.println(valor);
        System.out.println(valor / 100 + " nota(s) de R$ 100,00");
        valor = valor % 100;
        System.out.println(valor / 50 + " nota(s) de R$ 50,00");
        valor = valor % 50;
        System.out.println(valor / 20 + " nota(s) de R$ 20,00");
        valor = valor % 20;
        System.out.println(valor / 10 + " nota(s) de R$ 10,00");
        valor = valor % 10;
        System.out.println(valor / 5 + " nota(s) de R$ 5,00");
        valor = valor % 5;
        System.out.println(valor / 2 + " nota(s) de R$ 2,00");
        valor = valor % 2;
        System.out.println(valor / 1 + " nota(s) de R$ 1,00");
    }
}
