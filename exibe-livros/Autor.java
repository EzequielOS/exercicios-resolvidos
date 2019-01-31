/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 24/01/2019
Objetivo sucinto do arquivo: Programa cria uma classe Autor com metodo equals() para composicao em TestaAutorLivro
Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/1Znd6TTkM0lh0M9vUTP1yVve8KSKEn8TlKzfJf8zyX9U/edit 
Informações adicionais: 
 

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

	public boolean equals(Autor outro) {
		if (email == null) {
			if(outro.email != null)
				return false;
		}
		else if(!email.equals(outro.email)) {
			return false;
		}
		else if(nome == null) {
			if(outro.nome != null) {
				return false;
			}
		}
		else if(!nome.equals(outro.nome)) {
			return false;
		}
		return true;
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
		return "Autor [Nome = " + getNome() + ", \nEmail = " + getEmail() + ", \nGenero = " + getGenero() + "]";
	}

}
