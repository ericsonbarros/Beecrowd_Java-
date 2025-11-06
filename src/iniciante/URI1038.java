package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1038 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new  Scanner(System.in);
        int opcao = leitor.nextInt();
        int quantidade = leitor.nextInt();
        switch (opcao) {
            case 1:

                System.out.printf("Total: R$ %.2f%n", quantidade * 4.00);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f%n", quantidade * 4.50);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f%n", quantidade * 5.00);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f%n", quantidade * 2.00);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f%n", quantidade * 1.50);
                break;
            default:
                break;
        }
    }
}
