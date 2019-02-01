/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 31/01/2019
Objetivo sucinto do programa: Exibir threads
Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/1g6IIaB-HUmiA4QaFkECVG4JA0PRx2BDExf2RtSj4XnQ/edit 
Informações adicionais: 
*/

public class Teste {
	public static void main(String[] args) {
		MinhaThread thread1 = new MinhaThread("Tread#1", 600);
		
		MinhaThread thread2 = new MinhaThread("Tread#2", 900);
		
		MinhaThread thread3 = new MinhaThread("Tread#3", 500);
	}
}
