// Aula 07 - If encadeado
package Algoritmo_Logica.Class;
// @author Cauã Sousa
import java.util.Scanner;
public class Aprendizados07 {
    public static void main(String[] args) {
        Aprendizado01Aula07.main(args);
    }
}
// If encadeado
class Aprendizado01Aula07 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula07 = new Scanner(System.in);
        int n1, n2;

    	System.out.println("Digite o primeiro número");
        n1 = scAula07.nextInt();
        System.out.println("Digite o segundo número");
        n2 = scAula07.nextInt();
    		
    	if (n1 == n2) {
            System.out.println("Números Iguais");
        } else if (n1 > n2) {
            System.out.printf("MAIOR número é = %d%n", n1);
        } else {
            System.out.printf("MAIOR número é = %d%n", n2);
        }
        scAula07.nextLine();
        scAula07.nextLine();
        scAula07.close();
    }
}