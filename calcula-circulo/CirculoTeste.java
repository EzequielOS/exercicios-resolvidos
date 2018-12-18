/*
Nome do autor: Ezequiel Oliveira
Data de criação do arquivo: 13/12/2018
Objetivo sucinto do programa: Progama tem a finalidade de executar Circulo.java
Referência ao enunciado/origem do exercício: Exercicios da Lista
Informações adicionais: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/
import java.text.DecimalFormat;

public class CirculoTeste {
    public static void main (String[] args){
        DecimalFormat dc = new DecimalFormat("0.00");

        Circulo c1 = new Circulo(5.0, "Amarelo");
        Circulo c2 = new Circulo(1.2);

        System.out.println("Figura1 (F1): \n" + c1.toString());
        System.out.println("Area F1: "+ dc.format(c1.getArea()));
        System.out.println("Circunfere F1: "+ dc.format(c1.getCircunferencia()));
        System.out.println();
        System.out.println("Figura2 (F2): \n" + c2.toString());
        System.out.println("Area F2: "+ dc.format(c2.getArea()));
        System.out.println("Circunfere F2: "+ dc.format(c2.getCircunferencia()));

    }
}
