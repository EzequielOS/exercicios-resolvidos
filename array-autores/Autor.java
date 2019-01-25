/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 24/01/2019
Objetivo sucinto do arquivo: Programa cria uma classe Autor para composicao em TestaAutorLivro
Referencia: URI Online Judge
Informacoes adicionais:

 */

public class Autor {
	private String nome;
	private String email;
	private char genero = ' ';

	public Autor(String nome, String email, char genero) {
		this.nome = nome;
		this.email = email;
		if (genero == 'm' || genero == 'f') {
			this.genero = genero;
		} else {
			throw new IllegalArgumentException("Use 'm' ou 'f'.");
		}
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGenero() {
		return genero;
	}

	public String toString() {
		return "Autor [Nome = " + getNome() + ", \nEmail = " + getEmail() + ", \nGenero = " + getGenero() + "]\n";
	}

}
