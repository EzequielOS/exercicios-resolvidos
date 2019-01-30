
/*Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 29/01/2019
Objetivo sucinto do arquivo: Programa cria uma classe que exibe dados de uma Fatura de um determinado Cliente
Referencia: 
Informacoes adicionais:
 */

public class TestaClienteFatura {
 public static void main(String[] args) {	

	
	Cliente cliente1 = new Cliente(05, "Steve Rogers", 9);
	Fatura fatura1 = new Fatura(3356, cliente1, 500.00);
	
	
	System.out.println(fatura1);
	
}
}
