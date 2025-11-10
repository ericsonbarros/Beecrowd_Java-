package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1043 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        float a, b, c;
        a = leitor.nextFloat();
        b = leitor.nextFloat();
        c = leitor.nextFloat();
        if (a + b > c && a + c > b && b + c > a) {
            float perimentro = a + b + c;
            System.out.println("Perimetro = " + perimentro);
        } else  {
            float area = (a+b)*c/2;
            System.out.println("Area = " + area);
        }
    }
}
