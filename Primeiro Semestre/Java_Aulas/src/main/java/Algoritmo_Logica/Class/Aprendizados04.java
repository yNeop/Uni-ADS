// Aula 04 - If Else
package Algoritmo_Logica.Class;
// @author Cauã Sousa
import java.util.Scanner;
public class Aprendizados04 {
    public static void main(String[] args) {
        Aprendizado01Aula04.main(args);
        Aprendizado02Aula04.main(args);
        Aprendizado03Aula04_Pós.main(args);
        Aprendizado04Aula04_Pós.main(args);
    }
}
// Sinais de If e Else
class Aprendizado01Aula04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula04 = new Scanner(System.in);

        System.out.println("Os tipos de If e Else estão nas anotações do Programa, veja!");
		// igual == maior > menor < maior ou igual >= menor ou igual <= diferente !=
		System.out.println("==");
		System.out.println(">");
		System.out.println("<");
		System.out.println(">=");
		System.out.println("<=");
		System.out.println("!=");

        scAula04.nextLine();
    }
}
// If e Else
class Aprendizado02Aula04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula04 = new Scanner(System.in);
        int x, y;
        
        System.out.println("Digite o valor de X:");
        x = scAula04.nextInt();
        System.out.println("Digite o valor de Y:");
        y = scAula04.nextInt();
        	
        if (x > y) {
            System.out.println("X é maior do que Y");
        } else if (x == y) {
            System.out.println("X é = Y");
        } else {
            System.out.println("Y é maior do que X");
        }
        scAula04.nextLine();
        scAula04.nextLine();
    }
}
// Introdução às Strings
class Aprendizado03Aula04_Pós {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula04 = new Scanner(System.in);
		String str = "Olá, Mundo!!";
        // Ela ensinou String só agora.
        System.out.println(str);
        // Sim, esse foi o conteudo passado na aula.
        scAula04.nextLine();
    }
}
// boolean
class Aprendizado04Aula04_Pós {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula04 = new Scanner(System.in);
		String str1 = "Hello, ";
		String str2 = "World!!";
        /* Boolean é um tipo primitivo que representa um valor lógico, ou seja, 
		 * um valor que pode ser verdadeiro ou falso. */
		/* O método equals() da classe String é usado para comparar o conteúdo 
		 * de duas strings e determinar se elas são iguais. */
		boolean avalia = str1.equals(str2);
        // Retorna False
		if (avalia == true) {
			System.out.println("São Iguais!");
		} else {
			System.out.println("São Diferentes!!");
		}
        scAula04.nextLine();
        scAula04.close();
    }
}