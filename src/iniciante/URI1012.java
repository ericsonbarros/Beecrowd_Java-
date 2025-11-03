package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1012 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        float num_1, num_2, num_3;
        num_1 = leitor.nextFloat();
        num_2 = leitor.nextFloat();
        num_3 = leitor.nextFloat();
        double area_r = (num_1 * num_3) / 2;
        double area_t = ((num_1 + num_2) * num_3) / 2;
        double area_c = num_3 * num_3 * 3.14159;
        double area_q = num_2 * num_2;
        double area_ret = num_1 * num_2;
        System.out.println("TRIANGULO: " + String.format("%.3f", area_r));
        System.out.println("CIRCULO: " + String.format("%.3f", area_c));
        System.out.println("TRAPEZIO: " + String.format("%.3f", area_t));
        System.out.println("QUADRADO: " + String.format("%.3f", area_q));
        System.out.println("RETANGULO: " + String.format("%.3f", area_ret));
    }
}
