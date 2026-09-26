// Aula02 - Variaveis e Scanner
package Algoritmo_Logica.Class;
// @author Cauã Sousa
import java.util.Scanner;
public class Aprendizados02 {
    public static void main(String[] args) {
        Aprendizado01Aula02.main(args);
        Aprendizado02Aula02.main(args);
        Aprendizado03Aula02.main(args);
        Aprendizado04Aula02.main(args);
        Aprendizado05Aula02.main(args);
    }
}
// Declarar Variaveis
class Aprendizado01Aula02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula02 = new Scanner(System.in);
        float altura1 = 1.76f;
		double altura2 = 1.68;
		int idade1 = 21, idade2 = 19, quant_alunos = 30;

		System.out.println("A Média de Altura da turma é: " + (altura1 + altura2) / 2);
		System.out.println("A Média de Idade da turma é: " + (idade1 + idade2) / 2);
		System.out.println("A Quantidade de Alunos na sala é: " + quant_alunos);

        System.out.println("ENTER para o próximo Aprendizado.");
        scAula02.nextLine();
    }
}
// Declarar Variaveis
class Aprendizado02Aula02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula02 = new Scanner(System.in);
        int minha_idade = 21;

		System.out.println("Eu tenho: " + minha_idade + " anos");

        System.out.println("ENTER para o próximo Aprendizado.");
        scAula02.nextLine();
    }
}
// Declarar Variaveis
class Aprendizado03Aula02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula02 = new Scanner(System.in);
        float valor1 = 10; // Float vai até 6 casas decimais e é mais leve que Double
		double valor2 = 7.5; // Esse Double foi desnecessário, pois o Float conseguiria fazer
		double resultado = valor1 + valor2; // a mesma coisa considerando que foram apenas 2

		System.out.println("Resultado = " + resultado); // casas decimais

        System.out.println("ENTER para o próximo Aprendizado.");
        scAula02.nextLine();
    }
}
// Use o "import java.util.Scanner;" para trazer a função do Scanner
class Aprendizado04Aula02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula02 = new Scanner(System.in);
        String aluno;
        int idade;

        System.out.println("Digite o seu nome: ");  // Com nextLine você pode digitar texto
        aluno = scAula02.nextLine();                 // para String
        System.out.println("Digite sua idade: "); // e com nextInt você pode digitar número
        idade = scAula02.nextInt();                // para int

        System.out.println("Olá, " + aluno + ", sua idade é de " + idade + " anos");
        // scAula02.close(); // Sempre feche o Scanner no final do código
        System.out.println("ENTER para o próximo Aprendizado.");
        scAula02.nextLine();
        scAula02.nextLine();
    }
}
// Calculadora Simples
class Aprendizado05Aula02 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula02 = new Scanner(System.in);
        int n1, n2, soma, sub, multi, div, resto;

        System.out.println("Apenas números inteiros");
        System.out.println("Digite o primeiro número: ");
        n1 = scAula02.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = scAula02.nextInt();

        soma = n1 + n2;
        sub = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;
        resto = n1 % n2;
                
        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + sub);
        System.out.println("Multiplicação = " + multi);
        System.out.println("Divisão = " + div + " E seu Resto é = " + resto);

        scAula02.nextLine();
        scAula02.nextLine();
        scAula02.close();
    }
}