/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 31/01/2019
Objetivo sucinto do arquivo: Programa cria uma classe Livro para composicao em TestaAutorLivro
Referência ao enunciado/origem do exercício:: https://docs.google.com/document/d/1tHsvSkW3aBy2ZpfaSjeoBOKYCG-XaKoBZA8AwFiPxlw/edit
Informacoes adicionais: 
 */

public class TesteStrings {
	public static void main(String[] args) {
		StringBuffer frase = new StringBuffer();
		// Usado devido ao thread-save quando na classe ha threads
		frase.append("Menina");
		frase.append(" Bonita");
		frase.append(" do laco");
		frase.append(" de fita.");
		System.out.println(frase);

		System.out.println();

		StringBuilder titulo = new StringBuilder();
		// usado aqui pelo exemplo simples
		titulo.append("Transformes");
		titulo.append(" a Era");
		titulo.append(" da Extincao.");
		System.out.println(titulo);
	}
}
