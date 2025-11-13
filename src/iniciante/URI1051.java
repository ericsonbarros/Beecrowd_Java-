package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1051 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double imposto = 0.00, diferenca, salario;
        salario = leitor.nextDouble();
        if (salario > 4500.00) {
            imposto = (1000*0.08) + (1500 * 0.18);
            diferenca = salario - 4500.00;
            imposto += diferenca * 0.28;
        } else if (salario > 3000.01 && salario <= 4500.00) {
            imposto = (1000*0.08);
            diferenca = salario - 3000.00;
            imposto += diferenca * 0.18;
        } else if (salario > 2000.01 && salario <= 3000.00) {
            diferenca = salario - 2000.00;
            imposto += diferenca * 0.08;
        }if (imposto > 0.00){
            System.out.printf("R$ %.2f\n", imposto);
        }else {
            System.out.println("Isento");
        }
    }
}
