package com.projetoextensao.model;
import java.util.List;
import java.util.LinkedList;
public class Conta {

    private String nome;
    private double saldo;
    private List<Transacao> historico = new LinkedList<>();

    public Conta(String nome) {
        this.nome = nome;
        this.saldo = 0;
    }

    public Conta() {}

    // Metodos set
    public void setNome(String nome) { this.nome = nome; }

    public void setSaldo(double saldo) { this.saldo = saldo; }

    // Metodos get
    public String getNome() { return nome; }

    public double getSaldo() { return saldo; }

    // Metodos Historico
    public void addHistorico(Transacao transacao) {
        this.historico.add(transacao);
    }

    public void listarHistorico() {
        for(Transacao t : historico) {
            System.out.printf("[%s] - Valor: R$  %.2f - %s\n", 
                t.getTipo(),
                t.getValor(),
                t.getDescricao());
        }
    }
}