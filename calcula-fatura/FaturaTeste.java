/*
Nome do autor: Ezequiel Oliveira
Data de criação do arquivo: 19/12/2018
Objetivo sucinto do programa: Programa feito para Calcular as especificações de uma fatura
Referência ao enunciado/origem do exercício: Exercicios da Lista 1
Informações adicionais: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

import java.text.DecimalFormat;

public class FaturaTeste {
    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("0.00");


        Fatura fatura1 = new Fatura(001, "Memoria-RAM", 5, 199.81);
        Fatura fatura2 = new Fatura(002, "Cabo HDMI", 30, 49.89);
        Fatura fatura3 = new Fatura(003, "Processador AMD", 6, 800.00);
        fatura1.setQuantidade(3);
        fatura3.setPrecoUnidade(600.88);

        System.out.println(fatura1.toString());
        System.out.println("Pecas em estoque: " + fatura1.getQuantidade());
        System.out.println("Preco unitario: " + fatura1.getPrecoUnidade());
        System.out.println("Preco total: " + dc.format(fatura1.getPrecoTotal()));

        System.out.println();
        System.out.println(fatura2.toString());
        System.out.println("Pecas em estoque: " + fatura2.getQuantidade());
        System.out.println("Preco unitario: " + fatura2.getPrecoUnidade());
        System.out.println("Preco total: " + dc.format(fatura2.getPrecoTotal()));

        System.out.println();
        System.out.println("ID da peca: " + fatura3.getId() + " Nome da peca: " + fatura3.getDescricao());
        System.out.println("Pecas em estoque: " + fatura3.getQuantidade());
        System.out.println("Preco unitario: " + fatura3.getPrecoUnidade());
        System.out.println("Preco total: " + dc.format(fatura3.getPrecoTotal()));
    }
}
