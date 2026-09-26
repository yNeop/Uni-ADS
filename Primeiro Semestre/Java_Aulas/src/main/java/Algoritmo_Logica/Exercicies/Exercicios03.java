// Exercicios da Aula 03
package Algoritmo_Logica.Exercicies;
// @author Cauã Sousa
import java.util.Scanner;
public class Exercicios03 {
    public static void main(String[] args) {
        Exercicio01Aula03.main(args);
        Exercicio02Aula03.main(args);
        Exercicio03Aula03.main(args);
        Exercicio04Aula03.main(args);
        Exercicio05Aula03.main(args);
    }
}
// Realizar Teste de Mesa
class Exercicio01Aula03 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula03Ex = new Scanner(System.in);
        double x, y = 2.5;
        int a, b = 1, c;
        // Logo, valores iniciais: a = ?, b = 1, c = ?, x = ?, y = 2.5
        x = ++y;
        x *= 2;
        a = b + 1;
        a++;
        c = 2 * a + b;
        a = c--;
        b = a++ + --c;
        /* O Exercicio veio resolvido, mas com todos os println sendo de "b", apenas troquei 
         * pelos corretos */
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        scAula03Ex.nextLine();
    }
}
/* No contexto de um código completo em java, informe o último valor aramzenado em cada uma das 
 * variáveis do código a seguir */
class Exercicio02Aula03 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula03Ex = new Scanner(System.in);
        double m, n = 4.0;
        int i, j = 2, k;
        m = --n;
        m /= 2;
        i = j - 1;
        i++;
        // Fim do código, inicio do meu trabalho
        System.out.println("Valor de m: " + m);
        System.out.println("Valor de n: " + n);
        System.out.println("Valor de i: " + i);
        System.out.println("Valor de j: " + j);
        System.out.println("Valor de k: " + "Indefinido");
        /* O k não foi inicializado, portanto está indefinido então temos uma notificação
         * de erro */
        scAula03Ex.nextLine();
    }
}
/* No contexto de um código completo em java, informe o último valor aramzenado em cada uma das 
 * variáveis do código a seguir */
class Exercicio03Aula03 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula03Ex = new Scanner(System.in);
        float p, q = 3.3f;
        int x, y = 0, z;
        p = q++;
        p += 3;
        x = y * 2;
        x--;
        // Fim do código, inicio do meu trabalho
        System.out.println("Valor de p: " + p);
        System.out.println("Valor de q: " + q);
        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);
        System.out.println("Valor de z: " + "Indefinido");
        /* O valor de z não foi inicializado, portanto, indica um pequeno
         * erro no código */
        scAula03Ex.nextLine();
    }
}
/* No contexto de um código completo em java, informe o último valor aramzenado em cada uma das 
 * variáveis do código a seguir */
class Exercicio04Aula03 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula03Ex = new Scanner(System.in);
        double a, b = 5.5;
        int w, x = 3, y;
        a = b--;
        a *= 1.5;
        w = x / 2;
        w++;
        // Fim do código, inicio do meu trabalho
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de w: " + w);
        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + "Indefinido");
        /* O valor de y não foi inicializado, portanto, indica um pequeno
         * erro no código */
        scAula03Ex.nextLine();
    }
}
/* No contexto de um código completo em java, informe o último valor aramzenado em cada uma das 
 * variáveis do código a seguir */
class Exercicio05Aula03 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula03Ex = new Scanner(System.in);
        float i, j = 1.2f;
        int m, n = 4, o;
        i = ++j;
        i -= 0.5;
        m = n % 2;
        m--;
        // Fim do código, inicio do meu trabalho
        System.out.println("Valor de i: " + i);
        System.out.println("Valor de j: " + j);
        System.out.println("Valor de m: " + m);
        System.out.println("Valor de n: " + n);
        System.out.println("Valor de o: " + "Indefinido");
        /* O valor de o não foi inicializado, portanto, indica um pequeno
         * erro no código */
        scAula03Ex.nextLine();
    }
}