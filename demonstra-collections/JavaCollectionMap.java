/*
Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criação do arquivo: 29/01/2019
Objetivo sucinto do programa:
Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/16F6QhldM5D8wA6RISbLAvKviZ6amAqLVrmMzm5lDMLM/edit
Informações adicionais:
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

		/*
		HashSet<String> mySet = new HashSet<>();

		mySet.add("Banana");
		mySet.add("Apple");
		mySet.add("Orange");

		for (String fruit : mySet) {
			System.out.println(fruit);
		}
		*/
	}
}
