/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 24/01/2019
Objetivo sucinto do arquivo: Programa cria uma classe que exibe dados de um determinado livro
Referencia: URI Online Judge
Informacoes adicionais: 

 */

public class TestaAutorLivro {
	public static void main(String[] args) {
		Autor ziraldo = new Autor("Ziraldo", "ziraldomaluquinho00@gmail.com", 'd');
		Livro meninoMaluquinho = new Livro("Menino Maluquinho", ziraldo, 49.89);

		System.out.println(meninoMaluquinho);

	}
}
