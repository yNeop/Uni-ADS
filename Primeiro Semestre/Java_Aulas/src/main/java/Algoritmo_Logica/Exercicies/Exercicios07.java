// Exercicios da Aula 07
package Algoritmo_Logica.Exercicies;
// @author Cauã Sousa
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Exercicios07 {
    public static void main(String[] args) {
        Exercicio01Aula07.main(args);
        Exercicio02Aula07.main(args);
        Exercicio03Aula07.main(args);
        Exercicio04Aula07.main(args);
        Exercicio05Aula07.main(args);
        Exercicio06Aula07.main(args);
        Exercicio07Aula07.main(args);
    }
}
// Leia um número e informe se o mesmo é positivo, negativo ou nulo
class Exercicio01Aula07 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula07Ex = new Scanner(System.in);
        double numero;

        System.out.println("Digite um Número:");
        numero = scAula07Ex.nextDouble();
        	
        if (numero == 0) {
            System.out.println("Número " + numero + " é nulo");
        } else if (numero < 0) {
            System.out.println("Número " + numero + " é negativo");
        } else {
            System.out.printf("Número " + numero + " é positivo");
        }
        scAula07Ex.nextLine();
        scAula07Ex.nextLine();
    }
}
// Leia um nome, preço de custo e preço de venda de um produto, e mostra se houve lucro, prejuízo ou empate.
class Exercicio02Aula07 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula07Ex = new Scanner(System.in);
        Locale Brasil = Locale.of("pt", "BR");
        NumberFormat Real = NumberFormat.getCurrencyInstance(Brasil);
        	
        String produtoScanner, lucroString;
        double precoScanner, vendaScanner, lucroDouble;
        	
        System.out.println("Digite o nome do produto");
        produtoScanner = scAula07Ex.nextLine();
        System.out.println("Digite o custo do produto");
        precoScanner = scAula07Ex.nextDouble();
        System.out.println("Digite o valor de venda do produto");
        vendaScanner = scAula07Ex.nextDouble();
        	
        lucroDouble = vendaScanner - precoScanner; lucroString = Real.format(lucroDouble);
        	
        if (lucroDouble == 0) {
            System.out.println("Não houveram lucros na venda do produto: " + produtoScanner);
        } else if (lucroDouble > 0) {
            System.out.println("O Lucro foi positivo, no valor de " + lucroString);
        } else {
            System.out.println("O Lucro foi negativo, prejuizo de " + lucroString);
        }
        scAula07Ex.nextLine();
        scAula07Ex.nextLine();
    }
}
/* Leia o nome e as quatro notas de um aluno durante o semestre, e depois calcule a média
 * aritmética dessas notas. Se a média for maior ou igual a (seis) o aluno será aprovado. Se a
 * média for menor que seis o programa deverá ler a nota do exame final e calcular a nova
 * média, da seguinte forma: Média Final = (Média+Exame Final)/2. Nesse caso, para ser
 * aprovado a média final deverá ser maior ou igual a cinco. */
class Exercicio03Aula07 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula07Ex = new Scanner(System.in);

        String nomeScanner;
        double notaScanner1, notaScanner2, notaScanner3, notaScanner4, 
        mediaDouble, exameFinalScanner, mediaFinalDouble;

        System.out.println("Digite seu nome:");
        nomeScanner = scAula07Ex.nextLine();
        System.out.println("Digite sua primeira nota:");
        notaScanner1 = scAula07Ex.nextDouble();
        System.out.println("Digite sua segunda nota:");
        notaScanner2 = scAula07Ex.nextDouble();
        System.out.println("Digite sua terceira nota:");
        notaScanner3 = scAula07Ex.nextDouble();
        System.out.println("Digite sua quarta nota:");
        notaScanner4 = scAula07Ex.nextDouble();
        System.out.println();
        	
        mediaDouble = (notaScanner1 + notaScanner2 + notaScanner3 + notaScanner4) / 4;

        System.out.println("Aluno: " + nomeScanner);
        System.out.println("Media: " + mediaDouble);
        	
        if (mediaDouble >= 6) {
            System.out.println("Status: Aprovado!");
        } else {
            System.out.println("Status: Recuperação!");
            System.out.println("Digite a nota do Exame Final:");
            exameFinalScanner = scAula07Ex.nextDouble();
            System.out.println();

            mediaFinalDouble = (mediaDouble + exameFinalScanner) / 2;

        	if (mediaFinalDouble >= 6) {
                System.out.println("Status: Aprovado!");
            } else {
                System.out.println("Status: Reprovado...");
            }
        }
        scAula07Ex.nextLine();
        scAula07Ex.nextLine();
    }
}
/* Leia o comprimento de 3 pedaços de madeira e verifique se os mesmos podem formar um
 * triângulo. Se formar um triângulo, determine e informe o tipo de triângulo:
 * Equilátero = 3 lados iguais
 * Isósceles = 2 lados iguais
 * Escaleno = 3 lados diferentes */ 
class Exercicio04Aula07 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula07Ex = new Scanner(System.in);

        double compScanner1, compScanner2, compScanner3;
        	
        System.out.println("Digite o comprimento do primeiro pedaço de madeira: ");
        compScanner1 = scAula07Ex.nextDouble();
        System.out.println("Digite o comprimento do segundo pedaço de madeira: ");
        compScanner2 = scAula07Ex.nextDouble();
        System.out.println("Digite o comprimento do terceiro pedaço de madeira: ");
        compScanner3 = scAula07Ex.nextDouble();
        	
        if (compScanner1 > 0 && compScanner2 > 0 && compScanner3 > 0) {
            if (compScanner1 == compScanner2 && compScanner1 == compScanner3) {
                System.out.println("Três lados iguais formam um triângulo Equilátero");
            } else if (compScanner1 == compScanner2 || compScanner1 == compScanner3 || compScanner2 == compScanner3) {
                System.out.println("Dois lados iguais formam um triângulo Isósceles");
            } else {
                System.out.println("Nenhum lado igual forma-se um triângulo Escaleno");
            }
        } else {
            System.out.println("Não de forma nenhum triângulo sem 3 lados");
        }
        scAula07Ex.nextLine();
        scAula07Ex.nextLine();
    }
}
// Ler 3 números e informar o maior deles
class Exercicio05Aula07 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula07Ex = new Scanner(System.in);

        int numbScanner1, numbScanner2, numbScanner3;
        	
        System.out.println("Digite o primeiro número: ");
        numbScanner1 = scAula07Ex.nextInt();
        System.out.println("Digite o segundo número: ");
        numbScanner2 = scAula07Ex.nextInt();
        System.out.println("Digite o terceiro número: ");
        numbScanner3 = scAula07Ex.nextInt();

        if (numbScanner1 >= numbScanner2 && numbScanner1 >= numbScanner3) {
        	System.out.println("O Maior número é: " + numbScanner1);
        } else if (numbScanner2 >= numbScanner1 && numbScanner2 >= numbScanner3) {
            System.out.println("O Maior número é: " + numbScanner2);
        } else if (numbScanner3 >= numbScanner1 && numbScanner3 >= numbScanner2) {
            System.out.println("O Maior número é: " + numbScanner3);
        }
        scAula07Ex.nextLine();
        scAula07Ex.nextLine();
    }
}
/* Uma empresa determinou um reajuste salarial de 5% a todos os seus funcionários. Além
 * disto, concedeu um abono de R$ 100,00 para aqueles que recebem até R$750,00. Dado o
 * valor do salário de um funcionário, informar para quanto ele será reajustado. Desenvolva
 * um algoritmo para atender a essa demanda. */
class Exercicio06Aula07 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula07Ex = new Scanner(System.in);
        Locale Brasil = Locale.of("pt", "BR");
        NumberFormat Real = NumberFormat.getCurrencyInstance(Brasil);

        double salarioScanner, ajustadoDouble, abonoDouble = 100, salarioMax;
        String salarioReal, ajustadoReal, abonoReal, maxReal;
        	
        System.out.println("Digite seu Salario Atual");
        salarioScanner = scAula07Ex.nextDouble();
        System.out.println();
        	
        ajustadoDouble = (salarioScanner * 0.05) + salarioScanner;
        salarioMax = ajustadoDouble + abonoDouble;

        salarioReal = Real.format(salarioScanner);
        ajustadoReal = Real.format(ajustadoDouble);
        abonoReal = Real.format(abonoDouble);
        maxReal = Real.format(salarioMax);

        System.out.println("Salario antes do Reajuste: " + salarioReal);
        System.out.println("Salario após o Reajuste: " + ajustadoReal);
        	
        if (ajustadoDouble <= 750) {
            System.out.println("Você recebeu um abono de: " + abonoReal);
            System.out.println("Salario Final: " + maxReal);
        }
        scAula07Ex.nextLine();
        scAula07Ex.nextLine();
    }
}
// Complete o código
class Exercicio07Aula07 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula07Ex = new Scanner(System.in);
        int numeroScanner, idadeScanner;

        System.out.print("Digite um número inteiro: ");
        numeroScanner = scAula07Ex.nextInt();
        System.out.print("Digite sua idade: ");
        idadeScanner = scAula07Ex.nextInt();

        if (numeroScanner > 100) {
            if (idadeScanner > 30) {
                System.out.println("Número maior que 100 e idade maior que 30.");
            } else if (idadeScanner > 20) {
                System.out.println("Número maior que 100 e idade entre 21 e 30.");
            } else {
                System.out.println("Número maior que 100 e idade 20 ou menos.");
            }
        } else if (numeroScanner > 50) {
            if (idadeScanner > 30) {
                System.out.println("Número entre 51 e 100 e idade maior que 30.");
            } else if (idadeScanner > 20) {
                System.out.println("Número entre 51 e 100 e idade entre 21 e 30.");
            } else {
                System.out.println("Número entre 51 e 100 e idade 20 ou menos.");
            }
        } else {
            if (idadeScanner > 30) {
                System.out.println("Número 50 ou menos e idade maior que 30.");
            } else if (idadeScanner > 20) {
                System.out.println("Número 50 ou menos e idade entre 21 e 30.");
            } else {
                System.out.println("Número 50 ou menos e idade 20 ou menos.");
            }
        }
        scAula07Ex.nextLine();
        scAula07Ex.nextLine();
        scAula07Ex.close();
    }
}