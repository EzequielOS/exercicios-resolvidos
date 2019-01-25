import java.util.Arrays;

/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 24/01/2019
Objetivo sucinto do arquivo: Programa cria uma classe Livro para composicao em TestaAutorLivro
Referencia: URI Online Judge
Informacoes adicionais: 

 */


public class Livro {
	private String titulo;
	private Autor[] autores;
	private double preco;
	private int qtdadeLivros;
	
	public Livro(String titulo, Autor[] autor, double preco){
		this.titulo = titulo;
		this.autores = autor;
		this.preco = preco;
	}
	public Livro(String titulo, Autor[] autor, double preco, int qtadeLivros){
		this.titulo = titulo;
		this.autores = autor;
		this.preco = preco;
		this.qtdadeLivros = qtadeLivros;
	}
	public String getTitulo() {
		return titulo;
	}
	public Autor[] getAutores() {
		return autores;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtdadeLivros() {
		return qtdadeLivros;
	}
	public void setQtdadeLivros(int qtdadeLivros) {
		this.qtdadeLivros = qtdadeLivros;
	}
	
	public String toString() {
		return "Livro [ Titulo = " + getTitulo() +", Autores = " + getNomesDeAutores() + ", Preco = " + getPreco() + ", Quantidade = " + getQtdadeLivros();
	}
	public String getNomesDeAutores() {
		return Arrays.toString(autores);
		
	}
}
