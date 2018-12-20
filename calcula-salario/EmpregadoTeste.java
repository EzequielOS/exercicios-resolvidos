/*
Nome do autor: Ezequiel Oliveira
Data de criação do arquivo: 13/12/2018
Objetivo sucinto do programa: Progama tem a finalidade de executar Circulo.java
Referência ao enunciado/origem do exercício: Exercicios da Lista
Informações adicionais: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

import java.text.DecimalFormat;

public class EmpregadoTeste {
    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("0.00");

        Empregado ezequiel = new Empregado(001, "Ezequiel", "Oliveira", 800.00);
        Empregado karol = new Empregado(002, "Karol", "Alves", 1560.00);
        Empregado thais = new Empregado();
        thais.setId(003);
        thais.setSalario(2030.00);
        thais.setPrimeiroNome("Thais");
        thais.setSegundoNome("Anjos");


        System.out.println("Funcionario: " + ezequiel.toString());
        System.out.println("Nome = " + ezequiel.getNomeCompleto());
        System.out.println("Salario = " + dc.format(ezequiel.getSalario()));
        System.out.println("Salario em um ano = " + dc.format(ezequiel.getSalarioAnual()));
        ezequiel.setAumentoSalario(3.0);
        System.out.println("Salario apos aumento de 3% = " + dc.format(ezequiel.getSalario()));
        System.out.println("Salario em um ano com aumento = " + dc.format(ezequiel.getSalarioAnual()));

        System.out.println();
        System.out.println("Funcionario: " + karol.toString());
        System.out.println("Nome = " + karol.getNomeCompleto());
        System.out.println("Salario = " + dc.format(karol.getSalario()));
        System.out.println("Salaraio em um ano = " + dc.format(karol.getSalarioAnual()));
        karol.setAumentoSalario(4.0);
        System.out.println("Salario apos aumento de 4% = " + dc.format(karol.getSalario()));
        System.out.println("Salario em um ano com aumento = " + dc.format(karol.getSalarioAnual()));

        System.out.println();
        System.out.println("Funcionario: " + thais.getPrimeiroNome() + " ID = " + thais.getId());
        System.out.println("Nome = " + thais.getPrimeiroNome() + " " + thais.getSegundoNome());
        System.out.println("Salario = " + dc.format(thais.getSalario()));
        System.out.println("Salario em um ano = " + dc.format(thais.getSalarioAnual()));
        thais.setAumentoSalario(5.0);
        System.out.println("Salario apos aumento de 5% = " + dc.format(thais.getSalario()));
        System.out.println("Salario em um ano com aumento = " + dc.format(thais.getSalarioAnual()));
    }
}
