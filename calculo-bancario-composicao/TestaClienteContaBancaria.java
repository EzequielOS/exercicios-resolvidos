/*
Nome do autor: Ezequiel Oliveira
Data de criação do arquivo: 30/01/2019
Objetivo sucinto do programa: Programa cria uma classe TestaClienteContaBancaria
Referência ao enunciado/origem do exercício: Exercicios da Lista 2
Informações adicionais: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class TestaClienteContaBancaria {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(8, "Pepper Potts", 'F');
		Cliente cliente2 = new Cliente(32, "May Parker", 'F');
		
		ContaBancaria conta1 = new ContaBancaria(1125, cliente1, 500000.00);
		ContaBancaria conta2 = new ContaBancaria(8531, cliente2 , 120.00);
				
		System.out.println(conta1);
		System.out.println();
		System.out.println(conta2);
		
		conta1.realizarDebito(10000.00);
		conta2.realizarCredito(10000.00);
		
		System.out.println();
		System.out.println(conta1);
		System.out.println();
		System.out.println(conta2);
	}
}
