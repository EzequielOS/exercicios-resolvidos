/*
Nome do autor: Ezequiel Oliveira
Data de criação do arquivo: 19/12/2018
Objetivo sucinto do programa: Programa feito para Calcular as especificações de uma fatura
Referência ao enunciado/origem do exercício: Exercicios da Lista 1
Informações adicionais: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

public class Fatura {
    private int id;
    private String descricao;
    private int quantidade;
    private double precoUnidade;

    public Fatura(){

    }

    public Fatura(int id, String descricao, int quantidade, double precoUnidade){
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnidade = precoUnidade;
    }

    public int getId(){
        return this.id;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public double getPrecoUnidade(){
        return this.precoUnidade;
    }
    public void setPrecoUnidade(double precoUnidade){
        this.precoUnidade = precoUnidade;
    }
    public double getPrecoTotal(){
        return this.precoUnidade * (double) this.quantidade;
    }
    public String toString(){
        return "ID da Peca: " + id + " Nome da Peca: " + descricao;
    }
}
