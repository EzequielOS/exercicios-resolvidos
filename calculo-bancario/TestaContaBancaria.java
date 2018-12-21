/*
Nome do autor: Ezequiel Oliveira
Data de criação do arquivo: 20/12/2018
Objetivo sucinto do programa: Programa feito para simular uma possivel transferencia bancaria
Referência ao enunciado/origem do exercício: Exercicios da Lista 1
Informações adicionais: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/
import java.text.DecimalFormat;

public class TestaContaBancaria {
    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("0.00");

        ContaBancaria zeroum = new ContaBancaria(0027, "Ezequiel SantAna", 523.00);
        ContaBancaria zerodois = new ContaBancaria(0036, "Ana Oliveira", 900.65);
        ContaBancaria zerotres = new ContaBancaria(0055, "Maria Eduarda", 63.80);


        System.out.println("-----------------------------------------------------");
        System.out.println();
        System.out.println(zeroum.toString() + " Saldo= " + dc.format(zeroum.getSaldo()));
        System.out.println(zeroum.realizarTranferencia(zerodois, 23.25));
        System.out.println("Titular da conta destino: " + zerodois.getNomeTitular());
        System.out.println("Saldo total da sua conta: " + dc.format(zeroum.getSaldo()));
        System.out.println("-----------------------------------------------------");

        System.out.println();
        System.out.println(zerodois.toString() + " Saldo= " + dc.format(zerodois.getSaldo()));
        System.out.println(zerodois.realizarTranferencia(zerotres, 589.01));
        System.out.println("Titular da conta destino: " + zerotres.getNomeTitular());
        System.out.println("Saldo total da sua conta: " + dc.format(zerodois.getSaldo()));
        System.out.println("-----------------------------------------------------");

        System.out.println();
        System.out.println("ID= " + zerotres.getId() + " Conta de = " + zerotres.getNomeTitular() + " Saldo= " + dc.format(zerotres.getSaldo()));
        System.out.println(zerotres.realizarTranferencia(zerotres, 700.32));
        System.out.println("Titular da conta destino: " + zeroum.getNomeTitular());
        System.out.println("Saldo total da sua conta: " + dc.format(zerotres.getSaldo()));
        System.out.println("-----------------------------------------------------");
    }
}
