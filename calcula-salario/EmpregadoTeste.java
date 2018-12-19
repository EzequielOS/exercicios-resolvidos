/*
Nome do autor: Ezequiel Oliveira
Data de criação do arquivo: 13/12/2018
Objetivo sucinto do programa: Progama tem a finalidade de executar Circulo.java
Referência ao enunciado/origem do exercício: Exercicios da Lista
Informações adicionais: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado ezequiel = new Empregado(001, "Ezequiel", "Oliveira", 800.00);

        System.out.println("Funcionario: " + ezequiel.toString());
        System.out.println("Nome = " + ezequiel.getNomeCompleto());
        System.out.println("Salario = " + ezequiel.getSalario());
        System.out.println("Salario em um ano = " + ezequiel.getSalarioAnual());
        ezequiel.setAumentoSalario(3.0);
        System.out.println("Salario apos aumento de 3% = " + ezequiel.getSalario());
        System.out.println("Salario em um ano com aumento = " + ezequiel.getSalarioAnual());
    }
}
