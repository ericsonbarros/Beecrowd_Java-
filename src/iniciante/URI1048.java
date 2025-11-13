package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1048 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        
        double salario, novoSalario, valorReajuste;
        
        salario = leitor.nextDouble();
        
        if (salario <= 400.00) {
            novoSalario = salario + (salario * 15)/100;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            valorReajuste = novoSalario - salario;
            System.out.printf("Reajuste ganho: %.2f\n", valorReajuste);
            System.out.println("Em percentual: 15 %");
        } else if (salario <= 800.00) {
            novoSalario = salario + (salario * 12)/100;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            valorReajuste = novoSalario - salario;
            System.out.printf("Reajuste ganho: %.2f\n", valorReajuste);
            System.out.println("Em percentual: 12 %");
        } else if (salario <= 1200.00) {
            novoSalario = salario + (salario * 10)/100;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            valorReajuste = novoSalario - salario;
            System.out.printf("Reajuste ganho: %.2f\n", valorReajuste);
            System.out.println("Em percentual: 10 %");
        } else if (salario <= 2000.00) {
            novoSalario = salario + (salario * 7)/100;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            valorReajuste = novoSalario - salario;
            System.out.printf("Reajuste ganho: %.2f\n", valorReajuste);
            System.out.println("Em percentual: 7 %");
        }else {
            novoSalario = salario + (salario * 4)/100;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            valorReajuste = novoSalario - salario;
            System.out.printf("Reajuste ganho: %.2f\n", valorReajuste);
            System.out.println("Em percentual: 4 %");
        }
    }
}
