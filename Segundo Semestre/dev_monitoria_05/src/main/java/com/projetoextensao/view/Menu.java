package com.projetoextensao.view;

import java.util.Scanner;

public class Menu {

    private Scanner sc = new Scanner(System.in);

    public int menu() {

        System.out.println("""
        ===== BANCO =====
        1. Depositar
        2. Debitar
        3. Listar Histórico
        0. Sair

        Opção: """);

        return sc.nextInt();
    }

    public double lerValor() {

        System.out.print("Valor: ");
        return sc.nextDouble();
    }

    public String lerDescricao() {

        sc.nextLine(); // limpa buffer

        System.out.print("Descrição: ");
        return sc.nextLine();
    }

    public String lerNome() {

        sc.nextLine(); // limpa buffer

        System.out.print("Nome da conta: ");
        return sc.nextLine();
    }

    public void mostrarMensagem(String mensagem) {

        System.out.println(mensagem);
    }
}