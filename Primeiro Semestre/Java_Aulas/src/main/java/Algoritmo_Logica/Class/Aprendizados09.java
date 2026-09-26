// Aula 09 - For
package Algoritmo_Logica.Class;
// @author Cauã Sousa
import java.util.Scanner;
public class Aprendizados09 {
    public static void main(String[] args) {
        Aprendizado01Aula09.main(args);
    }
}
/* While significa "Enquanto"
 * For significa "Para". E ele é dividido em
 * três partes em uma unica linha, diferente
 * do while. Quando se sabe a contagem de números
 * o "For" é mais indicado do que o While */
class Aprendizado01Aula09 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula09 = new Scanner(System.in);
        int i;

        System.out.println("10 \"Boa Noite!\" para você!");
		for (i = 1; i <= 10; i++) {
			System.out.println("Boa Noite! " + i);
		}
        scAula09.nextLine();
        scAula09.close();
    }
}