/*
Nome do autor: Ezequiel Oliveira
Data de criação do arquivo: 20/12/2018
Objetivo sucinto do programa: Programa feito para simular atividades de uma biblioteca
Referência ao enunciado/origem do exercício: Exercicios da Lista 1
Informações adicionais: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/
import java.util.Date;
import java.text.SimpleDateFormat;

public class TestaLivro {
    public static void main(String[] args) {
        Date dataAtual = new Date();
        Date dataVencimento = new Date();
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");


        Livro[] romance = new Livro[0];

        Livro[] gibis = new Livro[4];

        gibis[0] = new Livro(3, "Turma da Monica", "Mauricio de Sousa", dataAtual, dataVencimento, "disponivel", 5);
        gibis[1] = new Livro(2, "Menino Maluquinho2", "Ziraldo", dataAtual, dataVencimento, "disponivel", 3);
        gibis[2] = new Livro(4, "Sitio do Pica Pau Amarelo", "Monteiro Lobato", dataAtual, dataVencimento, "disponivel", 15);
        gibis[3] = new Livro(1, "Menino Maluquinho", "Ziraldo", dataAtual, new Date(dataAtual.getTime() - (1728 * 100000)), "emprestado", 9);


        System.out.println(gibis[0].emprestarLivro());
        System.out.println(gibis[0].devolverLivro());
        System.out.println(gibis[1].emprestarLivro());
        System.out.println(Livro.buscarLivro(gibis, "Turma da Monica", "Mauricio de Sousa"));

        System.out.println("Livros Emprestados: ");
        System.out.println(Livro.exibirLivrosEmprestados(gibis));

        System.out.println("Livros Disponiveis: ");
        System.out.println(Livro.exibirLivrosDisponiveis(gibis));

        System.out.println("Livros atrasados: ");
        System.out.println(Livro.exibirLivrosAtrasados(gibis));
        System.out.println("Multa por atraso: " + gibis[3].gerarMulta(2.00));

        System.out.println(Livro.exibirLivrosMaisEmprestados(gibis));

        System.out.println(gibis[1]);
    }
}
