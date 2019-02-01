/*
Nome do autor: Ezequiel Oliveira
Data de criação do arquivo: 30/01/2019
Objetivo sucinto do programa: Programa cria uma classe ContaBancaria para composicao em TestaClienteContaBancaria
Referência ao enunciado/origem do exercício: Exercicios da Lista 2
Informações adicionais: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/

public class ContaBancaria {
    private int id;
    private Cliente cliente;
    private double saldo;

    public ContaBancaria(){

    	
    }
    public ContaBancaria(int id, Cliente cliente, double saldo){
        this.id = id;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    public int getId(){
        return this.id;
    }
    public Cliente getcliente(){
        return this.cliente;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo) {
		this.saldo = saldo;
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
    public String getNomeClienteBanco(){
    	return cliente.toString();
    }
    public String toString(){
        return "ID= " + this.id + " Conta de = " + this.cliente + "Saldo: " + getSaldo();
    }
}
