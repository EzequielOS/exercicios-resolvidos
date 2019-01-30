/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 29/01/2019
Objetivo sucinto do arquivo: Programa cria uma classe Cliente para composicao em TestaClienteFatura
Referencia: 
Informacoes adicionais:

 */

public class Cliente {
	private int id;
	private String nome;
	private int desconto;

	public Cliente(int id, String nome, int desconto) {
		this.id = id;
		this.nome = nome;
		this.desconto = desconto;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String toString() {
		return nome + "(ID: " + id + ")";
	}
}
