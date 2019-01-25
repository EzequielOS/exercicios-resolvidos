/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 24/01/2019
Objetivo sucinto do arquivo: Programa cria uma classe que exibe dados de um determinado livro
Referencia: URI Online Judge
Informacoes adicionais:

 */

public class TestaAutorLivro {
	public static void main(String[] args) {
		Autor[] autor = new Autor[2];

		autor[0] = new Autor("Ziraldo", "ziraldomaluquinho00@gmail.com", 'm');
		autor[1] = new Autor("Mauricio de Sousa", "mauriciomonica12@gmail.com", 'm');

		Livro monicaeMaluquinho = new Livro("Monica Maluquinha", autor, 49.89);

		System.out.println(monicaeMaluquinho);
		System.out.println(monicaeMaluquinho.getNomesDeAutores());

	}
}
