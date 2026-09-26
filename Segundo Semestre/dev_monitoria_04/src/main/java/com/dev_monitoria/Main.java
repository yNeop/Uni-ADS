package com.dev_monitoria;
import com.pratico.Exemplo;
// @author Cauã Sousa
import com.teorico.Revisao;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Revisao.executar(sc);
        transition(sc);
        Exemplo.executar(sc);
    }

    public static void transition(Scanner sc) {
        System.out.println("\nTecle ENTER para prosseguir:");
        sc.nextLine();
    }
}