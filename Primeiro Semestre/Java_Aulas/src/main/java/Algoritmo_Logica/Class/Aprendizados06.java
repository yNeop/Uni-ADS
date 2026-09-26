// Aula 06 - Uso de Operadores Lógicos
package Algoritmo_Logica.Class;
// @author Cauã Sousa
import java.util.Scanner;
public class Aprendizados06 {
    public static void main(String[] args) {
        Aprendizado01Aula06.main(args);
        Aprendizado02Aula06.main(args);
        Aprendizado03Aula06.main(args);
        Aprendizado04Aula06.main(args);
    }
}
// Operador "E" = &&
class Aprendizado01Aula06 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula06 = new Scanner(System.in);
    	boolean a, b;

        a = true; 
        b = true;
        // Exemplo de variaveis boolean - true e false
    	if (a==true && b==true) {
    		System.out.println("a && b são verdadeiras");
    	} else {
    		System.out.println("Resultado falso para a condição a && b");
    	}
    	
    	int idade = 19;
    	char carteiraMotorista = 'S';
        // Se alguma das duas variaveis fosse false, o print do else iria ser exibido
    	if (idade >= 18 && carteiraMotorista == 'S') {
    		System.out.println("Candidato selecionado");
    	} else {
    		System.out.println("Candidato não pode ser selecionado");
    	}
        scAula06.nextLine();
    }
}
// Operador "OU" = ||
class Aprendizado02Aula06 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula06 = new Scanner(System.in);
    	boolean x, y;
        int idade;
        
        x = true;
        y = true;

    	if (x || y) {
    		System.out.println("Resultado True para X ou para Y");
    	} else {
    		System.out.println("Resultado False para ambos");
    	}
    	
        idade = 40;

    	if (idade < 18 || idade > 70) {
    		System.out.println("Votação não obrigatoria");
    	} else {
    		System.out.println("Você é obrigado a votar");
    	}
        scAula06.nextLine();
    }
}
// Operador "NOT" = !
class Aprendizado03Aula06 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula06 = new Scanner(System.in);
    	boolean a, b;

    	a = true;
        b = !a;
    	
    	System.out.println("a = " +a);
    	System.out.println("b = " +b);
        scAula06.nextLine();
    }
}
// Classe Math para matematica em Java
class Aprendizado04Aula06 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula06 = new Scanner(System.in);
        double raio, area;
    	int num;

        num = 25;

    	System.out.println("Raiz de " + num + " é = " + Math.sqrt(num));
    	System.out.println("O Valor de PI = " +Math.PI);
    	System.out.println("O Valor de 10 elevado à 3 = " + Math.pow(10, 3));
    	System.out.println("O Maior valor entre 5 e 35 = " + Math.max(5, 35));
    	System.out.println("O Menor valor entre 5 e 35 = " + Math.min(5, 35));
        System.out.println();

        System.out.println("Digite o valor do raio de um circulo:");
    	raio = scAula06.nextDouble();

    	area = Math.PI * Math.pow(raio, 2);

    	System.out.println("A Área deste Circulo é = " + area);
        scAula06.nextLine();
        scAula06.nextLine();
        scAula06.close();
    }
}