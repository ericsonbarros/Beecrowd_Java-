package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1035 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int var_a = leitor.nextInt();
        int var_b = leitor.nextInt();
        int var_c = leitor.nextInt();
        int var_d = leitor.nextInt();
        if (var_b > var_c && var_d > var_a && (var_c + var_d) > (var_a + var_b) && var_c > 0 && var_d > 0 && var_a % 2 == 0){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
