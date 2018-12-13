/*
Nome do Autor: Ezequiel de Oliveira
Data de Criação do Arquivo: 12/12/2018
Objetivo sucinto do programa: Programa usado para exemplificar uma conta bancaria(POO)
Referência ao enunciado/origem do exercício: Livro: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016) - Copia
Informações adicionais: Pags 56 - 63
*/

import java.util.Scanner;

public class ContaBancoTeste {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ContaBanco minhaConta = new ContaBanco();

        System.out.printf("Nome inicial: %s%n%n", minhaConta.getName());
        System.out.println("Digite seu nome: ");
        String oNome = input.nextLine();
        minhaConta.setName(oNome);
        System.out.println();

        System.out.printf("Nome contido em minhaConta: %n%s%n",minhaConta.getName());

    }
}
