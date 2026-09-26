// Aula 03 - Forma Reduzida
package Algoritmo_Logica.Class;
// @author Cauã Sousa
import java.util.Scanner;
public class Aprendizados03 {
    public static void main(String[] args) {
        Aprendizado01Aula03.main(args);
        Aprendizado02Aula03.main(args);
        Aprendizado03Aula03.main(args);
    }
}
// Exemplo 01
class Aprendizado01Aula03 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula03 = new Scanner(System.in);
        int x, y;

        x = 4;
        y = 7;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		y = x;
		x = x + 1;
		
		//y = x++;
		System.out.println("x = " + x);
		System.out.println("y = " + y);

        System.out.println("ENTER para o próximo Aprendizado.");
        scAula03.nextLine();
    }
}
// Exemplo 02
class Aprendizado02Aula03 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula03 = new Scanner(System.in);
        int x;
    	x = 2;
    	System.out.println("x = " + x);
    	x = x + 1;
    	System.out.println("x = " + x);
    	System.out.println("_______________________");
    	// Forma Reduzida de X + 1:
    	x = 2;
    	System.out.println("x = " + x);
    	x ++;// A mesma coisa que x = x + 1;
    	System.out.println("x = " + x);
    	
    	int a, b;
    	a = 3;
    	b = 7;
    	System.out.println("_______________________");
    	System.out.println("a = " + a);
    	System.out.println("b = " + b);
    	a = a + 1;
    	b = a;
    	System.out.println("_______________________");
    	System.out.println("a = " + a);
    	System.out.println("b = " + b);
    	a = 3;
    	b = 7;
    	System.out.println("_______________________");
    	System.out.println("a = " + a);
    	System.out.println("b = " + b);
    	b = ++a;
    	System.out.println("_______________________");
    	System.out.println("a = " + a);
    	System.out.println("b = " + b);

        System.out.println("ENTER para o próximo Aprendizado.");
        scAula03.nextLine();
    }
}
// Troque os Conteudos de A e B
class Aprendizado03Aula03 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula03 = new Scanner(System.in);
        int a, b;
        int temp;

        a = 5;
        b = 2;
        
		System.out.println("Antes da Troca: a = " + a + " b = " + b);
		
		temp = a;
		a = b;
		b = temp;

		System.out.println("Depois da Troca: a = " + a + " b = " + b);

        scAula03.nextLine();
        scAula03.close();
    }
}