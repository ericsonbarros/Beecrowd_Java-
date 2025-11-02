package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1008 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double number = leitor.nextDouble();
        double horasTrabalho = leitor.nextDouble();
        double valorHora = leitor.nextDouble();
        double salario = horasTrabalho * valorHora;
        System.out.printf("NUMBER = %.0f\n", number);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
