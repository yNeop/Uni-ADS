package com.projetoextensao;

import com.projetoextensao.controller.ContaController;
import com.projetoextensao.model.Conta;
import com.projetoextensao.view.Menu;

public class Main {

    public static Menu view = new Menu();
    public static ContaController controller = new ContaController();

    public static void main(String[] args) {

        Conta conta = new Conta("Jubileu");

        int opcao;

        do {

            System.out.printf("""
            +======================+
            |    Banco Projeção    |
            +======================+
            Titular da Conta: %s
            Saldo da Conta: R$ %.2f
            
            """, conta.getNome(), conta.getSaldo());

            opcao = view.menu();

            switch (opcao) {

                case 1:

                    controller.depositar(
                        conta,
                        view.lerValor(),
                        view.lerDescricao()
                    );

                    break;

                case 2:

                    controller.debitar(
                        conta,
                        view.lerValor(),
                        view.lerDescricao()
                    );

                    break;

                case 3:

                    System.out.println("\n===== HISTÓRICO =====");

                    conta.listarHistorico();

                    break;

                case 0:

                    System.out.println("Encerrando sistema...");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}