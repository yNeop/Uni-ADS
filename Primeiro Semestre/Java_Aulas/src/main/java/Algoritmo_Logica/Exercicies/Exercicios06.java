// Exercicios da Aula 06
package Algoritmo_Logica.Exercicies;
// @author Cauã sousa
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Exercicios06 {
    public static void main(String[] args) {
        Exercicio01Aula06.main(args);
        Exercicio02Aula06.main(args);
        Exercicio03Aula06.main(args);
        Exercicio04Aula06.main(args);
        Exercicio05Aula06.main(args);
        Exercicio06Aula06.main(args);
    }
}
// Leia um número e informe se o mesmo está no intervalo entre 100 e 200, ou não
class Exercicio01Aula06 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula06Ex = new Scanner(System.in);
        int numero;

        System.out.println("Digite um Número:");
        numero = scAula06Ex.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("Seu número está entre 100 e 200");
        } else {
            System.out.println("Seu número NÃO está entre 100 e 200");
        }
        scAula06Ex.nextLine();
        scAula06Ex.nextLine();
    }
}
// Leia um número e verifique se o mesmo é divisível exato por 3 e por 7 ao mesmo tempo
class Exercicio02Aula06 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula06Ex = new Scanner(System.in);
        int numero;

        System.out.println("Digite um Número:");
        numero = scAula06Ex.nextInt();

        if (numero % 3 == 0 && numero % 7 == 0) {
            System.out.println("Seu número é divisivel por 3 e 7 ao mesmo tempo");
        } else {
            System.out.println("Seu número NÃO é divisivel por 3 e 7 ao mesmo tempo");
        }
        scAula06Ex.nextLine();
        scAula06Ex.nextLine();
    }
}
/* Leia um numero da conta, um número de agência e a uma senha e verifique se as mesmas são as mesmas 
 * armazenadas nas variáveis de uma determinada conta de banco. */
class Exercicio03Aula06 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula06Ex = new Scanner(System.in);
        Locale Brasil = Locale.of("pt", "BR");
        NumberFormat Real = NumberFormat.getCurrencyInstance(Brasil);

        String agencia, agenciaScanner, conta, contaScanner, saldoString;
        int banco, senha, senhaScanner;
        double saldo;

        conta = "40028922-0";
        agencia = "0002";
        senha = 123456;
        banco = 7843;
        saldo = 786.55;
        saldoString = Real.format(saldo);

        System.out.println("Digite o número da conta:");
        contaScanner = scAula06Ex.nextLine();
        System.out.println("Digite o número da agência:");
        agenciaScanner = scAula06Ex.nextLine();
        System.out.println("Digite o número da senha:");
        senhaScanner = scAula06Ex.nextInt();
        System.out.println();

        if (conta.equals(contaScanner) && agencia.equals(agenciaScanner) && senha == senhaScanner) {
            System.out.println("Logado com Sucesso");
            System.out.println("Agência " + agencia);
            System.out.println("Conta " + conta);
            System.out.println("Banco " + banco);
            System.out.println();
            System.out.println("Saldo: " + saldoString);
        } else {
            System.out.println("Login Errado!");
        }
        scAula06Ex.nextLine();
        scAula06Ex.nextLine();
    }
}
/* crie variáveis com os seguintes valores: CONTA = 999, SENHA = 456, SALDO = 100. O programa solicita 
 * ao usuário o numero da conta, a senha e o valor a ser sacado. O programa só deve liberar o dinheiro 
 * se os dados da conta e da senha estiverem corretos e se houver saldo suficiente para tal. Exiba 
 * mensagens de erro conforme necessário. */
class Exercicio04Aula06 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula06Ex = new Scanner(System.in);
        Locale Brasil = Locale.of("pt", "BR");
        NumberFormat Real = NumberFormat.getCurrencyInstance(Brasil);

        int conta, contaScanner, senha, senhaScanner;
        double saldo, saqueMath, saqueScanner;
        String saldoFinal, saldoAntes, valorSaque;

        conta = 999;
        senha = 456;
        saldo = 100;
        saldoAntes = Real.format(saldo);

        System.out.println("Digite o número da conta:");
        contaScanner = scAula06Ex.nextInt();
        System.out.println("Digite o número da senha:");
        senhaScanner = scAula06Ex.nextInt();
        System.out.println("Digite o valor para o saque:");
        saqueScanner = scAula06Ex.nextDouble();
        System.out.println();

        saqueMath = saldo - saqueScanner;

        valorSaque = Real.format(saqueScanner);
        saldoFinal = Real.format(saqueMath);

        if (conta == contaScanner && senha == senhaScanner && saldo >= saqueScanner) {
            System.out.println("Logado com Sucesso");
            System.out.println("Saldo: " + saldoAntes);
            System.out.println("Retirando " + valorSaque + " de sua conta...");
            System.out.println("Novo Saldo Atual: " + saldoFinal);
        } else {
            System.out.println("Login Errado!");
        }
        scAula06Ex.nextLine();
        scAula06Ex.nextLine();
    }
}
/* Um software comercial necessita de um sistema de segurança que protege a emissão de relatórios confi-
 * denciais. Ele deve solicitar o numero da matricula e a senha do funcionário e só então liberar o aces-
 * so. Implemente este sistema usando operadores lógicos E e OU de forma a permitir a entrada para os se-
 * guintes dados: 
 * MATRICULA1 = “987” SENHA1 = “789” MATRICULA2 = “321” SENHA2 = “123” MATRICULA3 = “654” SENHA3 = “456” */
class Exercicio05Aula06 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula06Ex = new Scanner(System.in);
        int MATRICULA1, MATRICULA2, MATRICULA3, MATRICULAUSER;
        int SENHA1, SENHA2, SENHA3, SENHAUSER;

        MATRICULA1 = 987;
        SENHA1 = 789;
        MATRICULA2 = 321;
        SENHA2 = 123;
        MATRICULA3 = 654;
        SENHA3 = 456;

        System.out.println("Digite sua MATRICULA:");
        MATRICULAUSER = scAula06Ex.nextInt();
        System.out.println("Digite sua SENHA:");
        SENHAUSER = scAula06Ex.nextInt();

        if (MATRICULA1 == MATRICULAUSER && SENHA1 == SENHAUSER
                || MATRICULA2 == MATRICULAUSER && SENHA2 == SENHAUSER
                || MATRICULA3 == MATRICULAUSER && SENHA3 == SENHAUSER) {
            System.out.println("Acesso Concedido!");
        } else {
            System.out.println("Acesso Negado!");
        }
        scAula06Ex.nextLine();
        scAula06Ex.nextLine();
    }
}
/* O jogo possui 4 rodadas e em cada rodada devem ser escolhidos (no código) 4 valores secretos entre 
 * 1 e 20. Em cada rodada o usuário digita um valor. O programa verifica se o valor digitado é um dos 
 * quatro números secreto da rodada e marca um ponto caso haja coincidência. No final das 4 rodadas, 
 * deve-se mostrar quantos acertos o usuário conseguiu. */
class Exercicio06Aula06 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula06Ex = new Scanner(System.in);
        // Definindo os valores secretos para cada rodada (fixos, entre 1 e 20)
        int[][] numerosSecretos = {
            {3, 5, 7, 9}, // Rodada 1
            {2, 4, 6, 8}, // Rodada 2
            {10, 11, 12, 13}, // Rodada 3
            {14, 15, 16, 17} // Rodada 4
        };

        int acertos = 0;

        // Loop para 4 rodadas
        for (int rodada = 0; rodada < 4; rodada++) {
            System.out.println("Rodada " + (rodada + 1) + " - Digite um número entre 1 e 20:");
            // Leitura do número digitado pelo usuário
            int tentativa = scAula06Ex.nextInt();
            // Verifica se a tentativa do usuário está entre os números secretos da rodada
            boolean acertou = false;
            for (int i = 0; i < 4; i++) {
                if (numerosSecretos[rodada][i] == tentativa) {
                    acertou = true;
                    break;
                }
            }
            // Se acertou, aumenta o contador de acertos
            if (acertou) {
                System.out.println("Você acertou!");
                acertos++;
            } else {
                System.out.println("Você errou.");
            }
        }
        // Exibe o número total de acertos ao final
        System.out.println("\nFim do jogo! Você acertou " + acertos + " vez(es).");
        scAula06Ex.nextLine();
        scAula06Ex.nextLine();
        scAula06Ex.close();
    }
}
