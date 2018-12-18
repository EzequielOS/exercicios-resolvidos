/*
Nome do autor: Ezequiel Oliveira
Data de criação do arquivo: 13/12/2018
Objetivo sucinto do programa: Programa feito para a construção de um circulo
Referência ao enunciado/origem do exercício: Exercicios da Lista
Informações adicionais: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

public class Circulo {
    double raio = 1.0;
    String cor = "vermelho";

    Circulo(){
    }

    Circulo(double raio){
        this.raio = raio;
    }
    Circulo(double raio, String cor){
        this.cor = cor;
        this.raio = raio;
    }

    public void setRaio(){
        this.raio = raio;
    }
    public void setCor(){
        this.cor = cor;
    }
    public double getRaio(){
        return raio;
    }
    public String getCor(){
        return cor;
    }

    double getArea(){
        double area = Math.PI * Math.pow(raio,2);
        return area;
    }
    double getCircunferencia(){
        double circuferencia = (2 * Math.PI) * raio;
        return circuferencia;
    }

    public String toString(){
        return "Circulo [raio="+ raio +", cor="+ cor +"]";
    }
}
