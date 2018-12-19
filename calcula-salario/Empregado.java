/*
Nome do autor: Ezequiel Oliveira
Data de criação do arquivo: 18/12/2018
Objetivo sucinto do programa: Programa feito para Calcular o percentual de aumento em um salario
Referência ao enunciado/origem do exercício: Exercicios da Lista 1
Informações adicionais: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

public class Empregado {
    int id;
    String primeiroNome;
    String segundoNome;
    double salario;

    Empregado(){

    }

    Empregado(int id, String primeiroNome, String segundoNome, double salario){
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.salario = salario;
    }

    public int getId(){
        return id;
    }
    public String getPrimeiroNome(){
        return primeiroNome;
    }
    public void setPrimeiroNome(String primeiroNome){
        this.primeiroNome = primeiroNome;
    }
    public String getSegundoNome(){
        return segundoNome;
    }
    public void setSegundoNome(String segundoNome){
        this.segundoNome = segundoNome;
    }
    public String getNomeCompleto(){
        return primeiroNome+" "+segundoNome;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalarioAnual(){
        return salario*12;
    }
    public void setAumentoSalario(double porcentagem){
        salario += (porcentagem / 100) * salario;
    }
    public String toString(){
        return "ID = "+ id;
    }
}
