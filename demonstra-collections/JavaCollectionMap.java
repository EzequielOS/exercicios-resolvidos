/*
Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de cria��o do arquivo: 29/01/2019
Objetivo sucinto do programa: 
Refer�ncia ao enunciado/origem do exerc�cio:https://docs.google.com/document/d/16F6QhldM5D8wA6RISbLAvKviZ6amAqLVrmMzm5lDMLM/edit 
Informa��es adicionais: 
*/

import java.util.HashMap;
public class JavaCollectionMap {
	public static void main(String[] args) {
		HashMap<String, Integer> myBooks = new HashMap<>();
		
		myBooks.put("Ender's Game", 4);
		myBooks.put("Ringworld", 3);
		myBooks.put("Heir to the Empire", 5);
		
		System.out.println(myBooks.containsValue(5));//true
		System.out.println(myBooks.containsValue(2));//false
	}
}
