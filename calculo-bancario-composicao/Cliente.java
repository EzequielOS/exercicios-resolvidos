/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 30/01/2019
Objetivo sucinto do arquivo: Programa cria uma classe Cliente para composicao em TestaClienteContaBancaria
Referência ao enunciado/origem do exercício: Exercicios da Lista 2
Informações adicionais: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit

 */

public class Cliente {
	private int id;
	private String nome;
	private char genero;
	
	public Cliente(int id, String nome, char genero) {
		this.id = id;
		this.nome = nome;
		if (genero == 'M' || genero == 'F') {
			this.genero = genero;
		} else {
			throw new IllegalArgumentException("Use 'M' ou 'F'.");
		}
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public char getGenero() {
		return genero;
	}
	
	public String toString() {
		return getNome() + "(ID:" + getId() + ") ";
	}
}
