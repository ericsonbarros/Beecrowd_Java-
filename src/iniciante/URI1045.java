package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1045 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double a, b, c, maior;
        a = leitor.nextDouble();
        b = leitor.nextDouble();
        c = leitor.nextDouble();
        if (b > a) {
            maior = a;
            a = b;
            b = maior;
        }
        if (c > a) {
            maior = a;
            a = c;
            c = maior;
        }
        if (a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        } else if (a * a == b * b + c * c){
            System.out.println("TRIANGULO RETANGULO");
        } else if (a * a > b * b + c * c){
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (a * a < b * b + c * c){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && b == c){
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b || b == c || a == c) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
