/*
Nome do autor: Ezequiel de Oliveira Sant'ana
Data de criação do arquivo: 03/01/2019
Objetivo sucinto do programa: Programa feito para o uso e aprendizagem de IllegalArgumentException
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
Informações adicionais:
*/
public class Demonstra_IllegalArgument {
	public static void main(String[] args) {

		try {
			System.out.println("Idade= " + idade(-18));
		} catch (IllegalArgumentException e) {
			System.out.println("nao existe idade negativa");
		}
	}

	public static int idade(int idade){
		if (idade < 0) {
			throw new IllegalArgumentException("Idade negativa ???");
		}
		return idade;
	}
}
