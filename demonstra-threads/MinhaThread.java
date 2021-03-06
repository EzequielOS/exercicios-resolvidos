/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 31/01/2019
Objetivo sucinto do programa: Configurar threads
Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/1g6IIaB-HUmiA4QaFkECVG4JA0PRx2BDExf2RtSj4XnQ/edit 
Informações adicionais: 
*/

public class MinhaThread extends Thread {
	private String nome;
	private int tempo;
	
	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}
	
	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo);
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nome + " Terminou execucao");
	}
}
