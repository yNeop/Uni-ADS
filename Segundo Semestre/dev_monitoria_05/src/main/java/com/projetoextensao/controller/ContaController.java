package com.projetoextensao.controller;

import com.projetoextensao.model.*;

public class ContaController {

    public void depositar(Conta conta, double valor, String descricao) {

        if (valor <= 0) {
            System.out.println("Valor inválido.\n");
            return;
        }

        conta.setSaldo(conta.getSaldo() + valor);

        Transacao transacao = new Transacao(
            TipoTransacao.ENTRADA,
            valor,
            descricao
        );

        conta.addHistorico(transacao);

        System.out.println("Depósito realizado.\n");
    }

    public void debitar(Conta conta, double valor, String descricao) {

        if (valor <= 0) {
            System.out.println("Valor inválido.\n");
            return;
        }

        if (conta.getSaldo() < valor) {
            System.out.println("Saldo insuficiente.\n");
            return;
        }

        conta.setSaldo(conta.getSaldo() - valor);

        Transacao transacao = new Transacao(
            TipoTransacao.SAIDA,
            valor,
            descricao
        );

        conta.addHistorico(transacao);

        System.out.println("Débito realizado.\n");
    }
}