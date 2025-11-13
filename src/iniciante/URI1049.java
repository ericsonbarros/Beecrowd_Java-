package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1049 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        String tipo1, tipo2, tipo3;

        tipo1 = leitor.nextLine();
        tipo2 = leitor.nextLine();
        tipo3 = leitor.nextLine();

        if (tipo1.equals("vertebrado")) {
            if (tipo2.equals("ave")){
                if (tipo3.equals("carnivoro")){
                    System.out.println("aguia");
                } else{
                    System.out.println("pomba");
                }
            } else {
                if (tipo3.equals("onivoro")){
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                }
            }
        } else{
            if (tipo2.equals("inseto")){
                if (tipo3.equals("hematofago")){
                    System.out.println("pulga");
                } else {
                    System.out.println("largata");
                }
            } else {
                if (tipo3.equals("hematofago")){
                    System.out.println("sanguessuga");
                } else{
                    System.out.println("minhoca");
                }
            }
        }
    }
}
