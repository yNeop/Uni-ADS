// Aula 01 - Print, Println
package Algoritmo_Logica.Class;
// @author Cauã Sousa
import java.util.Scanner;
public class Aprendizados01 {
    public static void main(String[] args) {
        Aprendizado01Aula01.main(args);
        Aprendizado02Aula01.main(args);
    }
}
// Hello World
class Aprendizado01Aula01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula01 = new Scanner(System.in);
        
        System.out.println("Hello, World!");

        System.out.println("ENTER para o próximo Aprendizado.");
        scAula01.nextLine();
    }
}
// Diferença entre Print e Println
class Aprendizado02Aula01 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula01 = new Scanner(System.in);
        /* 
         * print()
		 * Função: Imprime texto sem pular linha ao final.
		 * Uso comum: Quando você quer continuar imprimindo na mesma linha. 
         */
		System.out.print("Olá ");
		System.out.print("mundo!");
		System.out.println("\n");
		// Saída = Olá mundo!

		// se um \n é usado em um print, tudo que vem depois é exibido abaixo
		System.out.print("Olá \nmundo!");
		System.out.println("\n");
		/* 
         * Saída = Olá 
		 *         mundo! 
         */

		/* 
         * println()
		 * Função: Imprime texto e pula uma linha ao final.
		 * Uso comum: Para exibir uma linha completa de saída, e depois mover para a próxima. 
         */
		System.out.println("Olá ");
		System.out.println("mundo!");
		/* 
         * Saída = Olá 
		 *         mundo! 
         */

		// \n no println desce uma linha vazia
        scAula01.nextLine();
        scAula01.close();
    }
}