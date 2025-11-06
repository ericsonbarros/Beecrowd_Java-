package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1040 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        float nota_1, nota_2, nota_3, nota_4;
        nota_1 = leitor.nextFloat();
        nota_2 = leitor.nextFloat();
        nota_3 = leitor.nextFloat();
        nota_4 = leitor.nextFloat();
        float media = (nota_1 * 2 + nota_2 * 3 + nota_3 * 4 + nota_4 * 1) / 10;
        System.out.printf("Media: %.1f\n", media);
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            float nota_exame = leitor.nextFloat();
            System.out.println("Nota do exame: " + String.format("%.1f", nota_exame));
            float media_final = (media + nota_exame) / 2;
            if (media_final >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + String.format("%.1f", media_final));
            } else {
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + String.format("%.1f", media_final));
            }
        }
    }
}
