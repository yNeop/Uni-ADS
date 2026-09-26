// Estruturas de Repetição (Parte 2)
package Curso_Guanabara.Class;
// @author Cauã Sousa
import java.util.Scanner;
public class Aula12 {
    public static void main(String[] args) {
        Scanner scAula12 = new Scanner(System.in);
        AulaTeorica12.executar(scAula12);
        scAula12.close();
    }
}
class AulaTeorica12 {
    public static void executar(Scanner scAula12) {
        System.out.println("Hoje veremos Repetição com Teste no final, aperte ENTER:");
        scAula12.nextLine();

        int cc = 0;

        do {
            cc++;
            System.out.println("Cambalhota " + cc);
        } while (cc < 4);

        /*
        * do...while → executa pelo menos uma vez
        * while → executa 0 ou mais vezes, depende da condição
        * for → executa um número conhecido de vezes
        */
        
        System.out.println("\nAperte ENTER para prosseguir:");
        scAula12.nextLine();

        int n, s = 0;
        String resp;

        do {
            System.out.print("\nDigite um número inteiro: ");
            n = scAula12.nextInt();

            s += n; // mesmo que: s = s + n;

            System.out.print("Quer adicionar mais um à soma? [S/N]");
            scAula12.nextLine();
            resp = scAula12.nextLine();
        } while (resp.equals("S") || resp.equals("s") || resp.equals("Y") || resp.equals("y"));
        System.out.println("\nA soma dos números é = " + s);

        System.out.println("ENTER para finalizar a aula:");
        scAula12.nextLine();
    }
    public static void main(String[] args) {
        Scanner scAula12 = new Scanner(System.in);
        executar(scAula12);
        scAula12.close();
    }
}