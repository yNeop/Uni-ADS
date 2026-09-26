// Aula 08 - While
package Algoritmo_Logica.Class;
// @author Cauã Sousa
import java.util.Scanner;
public class Aprendizados08 {
    public static void main(String[] args) {
        Aprendizado01Aula08.main(args);
        Aprendizado02Aula08.main(args);
    }
}
// Uso do While
class Aprendizado01Aula08 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula08 = new Scanner(System.in);
        int cont = 1;

		while (cont <= 10) {
			System.out.println("Boa Noite...");
			cont++;
		}
		System.out.println("Fim!");
        scAula08.nextLine();
    }
}
// Uso do While Pt II
class Aprendizado02Aula08 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula08 = new Scanner(System.in);
        int contadorInt = 1;

		while (contadorInt <= 5) {
			System.out.println(contadorInt);
			contadorInt++;
		}
		System.out.println("Fim!");
        scAula08.nextLine();
        scAula08.close();
    }
}