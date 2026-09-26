// Lista 02, referente à Aula 01.
package Algoritmo_Logica.Lists;
// @author Cauã Sousa
import java.util.Scanner;
public class Lista02 {
    public static void main(String[] args) {
        Lista02Exercicio01.main(args);
        Lista02Exercicio02.main(args);
        Lista02Exercicio03.main(args);
        Lista02Exercicio04.main(args);
    }
}
// Mostrar Nome
class Lista02Exercicio01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista02 = new Scanner(System.in);
        String nome;

        nome = "Cauã de Araujo Sousa";
        
		System.out.println("Nome: " + nome);

        System.out.println("ENTER para o próximo Exercico.");
        scLista02.nextLine();
    }
}
// Nome e Email
class Lista02Exercicio02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista02 = new Scanner(System.in);
        String nome, email;

        nome = "Cauã de Araujo Sousa";
		email = "emaraujocaua@gmail.com";

		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);

        System.out.println("ENTER para o próximo Exercico.");
        scLista02.nextLine();
    }
}
// @ do Instagram
class Lista02Exercicio03 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista02 = new Scanner(System.in);
        String instagramid;

        instagramid = "caua_as";

		System.out.println("Instagram: @" + instagramid);

        System.out.println("ENTER para o próximo Exercico.");
        scLista02.nextLine();
    }
}
// Mostrar Forma
class Lista02Exercicio04 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scLista02 = new Scanner(System.in);

        System.out.println("#####");
		System.out.println("#   #");
		System.out.println("#   #");
		System.out.println("#####");

        scLista02.nextLine();
        scLista02.close();
    }
}