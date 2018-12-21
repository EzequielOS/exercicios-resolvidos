/*
Nome do autor: Ezequiel Oliveira
Data de criação do arquivo: 20/12/2018
Objetivo sucinto do programa: Programa feito para simular uma possivel transferencia bancaria
Referência ao enunciado/origem do exercício: Exercicios da Lista 1
Informações adicionais: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

public class ContaBancaria {
    private int id;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(){

    }
    public ContaBancaria(int id, String nomeTitular, double saldo){
        this.id = id;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    public int getId(){
        return this.id;
    }
    public String getNomeTitular(){
        return this.nomeTitular;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public double realizarCredito(double valor){
        return  this.saldo += valor;
    }
    public double realizarDebito(double valor){
        return this.saldo -= valor;
    }
    public String realizarTranferencia(ContaBancaria contaDestino, double valor){
        if(saldo >= valor){
            this.realizarDebito(valor);
            contaDestino.realizarCredito(valor);
            System.out.println(" Valor Transferido com Sucesso !");
        }
        else {
            System.out.println(" Saldo Insuficiente !");
        }
        return ("Valor  de transferencia: " + valor);
    }
    public String toString(){
        return "ID= " + this.id + " Conta de = " + this.nomeTitular;
    }
}
