package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1046 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new  Scanner(System.in);
        int inicio, fim, duracao;
        inicio = leitor.nextInt();
        fim = leitor.nextInt();
        int dia = 24;
        if (inicio > fim){
            duracao = (dia - inicio) + fim;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else if (inicio == fim) {
            duracao = dia;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else {
            duracao = (fim - inicio);
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
    }
}
