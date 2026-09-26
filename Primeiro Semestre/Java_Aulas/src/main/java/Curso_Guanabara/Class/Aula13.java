// Estruturas de Repetição (Parte 2)
package Curso_Guanabara.Class;
// @author Cauã Sousa
import java.util.Scanner;
public class Aula13 {
    public static void main(String[] args) {
        Scanner scAula13 = new Scanner(System.in);
        AulaTeorica13.executar(scAula13);
        scAula13.close();
    }
}
class AulaTeorica13 {
    public static void executar(Scanner scAula13) {
        System.out.println("Hoje veremos Repetição com Variavel de Controle (Usando For), aperte ENTER:");
        scAula13.nextLine();

        for (int cc = 1; cc <= 4; cc++) {
            System.out.println("Cambalhota " + cc);
        }

        System.out.println("\nTeste da print 03 da aula 13. Aperte ENTER:");
        scAula13.nextLine();

        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j <= 2; j += 2) {
                System.out.println("I = " + i + " | J = " + j + "\n");
            }
        }

        System.out.println("\nENTER para finalizar a aula:");
        scAula13.nextLine();
    }
    public static void main(String[] args) {
        Scanner scAula13 = new Scanner(System.in);
        executar(scAula13);
        scAula13.close();
    }
}