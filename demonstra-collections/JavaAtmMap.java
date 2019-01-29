/*
Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criação do arquivo: 29/01/2019
Objetivo sucinto do programa: 
Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/16F6QhldM5D8wA6RISbLAvKviZ6amAqLVrmMzm5lDMLM/edit 
Informações adicionais: 
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class JavaAtmMap {

	public static void main(String[] args) {

		int amount = 142;

		List<Integer> billValues = Arrays.asList(100, 50, 20, 10, 5, 2, 1);

		Map<Integer, Integer> distribution = getBillDistribution(amount, billValues);
		printOutput(amount, distribution);
	}

	public static void printOutput(int amount, Map<Integer, Integer> distribution) {
		System.out
				.println("Dividindo R$ " + amount + " em notas de R$ 100, " + "R$ 50, R$ 20, R$ 10, R$ 5, R$ 2 e R$ 1");

		for (Entry < Integer, Integer > e : distribution.entrySet()) {
			int value = e.getKey();
			int bills = e.getValue();
			
			System.out.println("Notas de R$ " + value + ": " + bills);
		}
	}

	public static Map<Integer, Integer> getBillDistribution(int amount, List<Integer> billValues) {
		HashMap<Integer, Integer> distribution = new HashMap<>();

		for (int value : billValues) {
			int bills = amount / value;
			if (bills > 0) {
				distribution.put(value, bills);
			}
			amount %= value;
		}
		return distribution;
	}
}