package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1021 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new  Scanner(System.in);
        float valor = leitor.nextFloat();
        System.out.println("NOTAS:");
        System.out.println((int) valor / 100 + " nota(s) de R$ 100.00");
        valor = valor % 100;
        System.out.println((int) valor / 50 + " nota(s) de R$ 50.00");
        valor = valor % 50;
        System.out.println((int) valor / 20 + " nota(s) de R$ 20.00");
        valor = valor % 20;
        System.out.println((int) valor / 10 + " nota(s) de R$ 10.00");
        valor = valor % 10;
        System.out.println((int) valor / 5 + " nota(s) de R$ 5.00");
        valor = valor % 5;
        System.out.println((int) valor / 2 + " nota(s) de R$ 2.00");
        valor = valor % 2;
        System.out.println("MOEDAS:");
        System.out.println((int) valor / 1 + " moeda(s) de R$ 1.00");
        valor = valor % 1;
        System.out.println((int) (valor / 0.50) + " moeda(s) de R$ 0.50");
        valor = valor % 0.50f;
        System.out.println((int) (valor / 0.25) + " moeda(s) de R$ 0.25");
        valor = valor % 0.25f;
        System.out.println((int) (valor / 0.10) + " moeda(s) de R$ 0.10");
        valor = valor % 0.10f;
        System.out.println((int) (valor / 0.05) + " moeda(s) de R$ 0.05");
        valor = valor % 0.05f;
        System.out.println((int) Math.round((valor / 0.01)) + " moeda(s) de R$ 0.01");
    }
}
