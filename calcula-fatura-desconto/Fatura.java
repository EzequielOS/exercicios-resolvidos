
/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 29/01/2019
Objetivo sucinto do arquivo: Programa cria uma classe Fatura para composicao em TestaClienteFatura
Referencia: 
Informacoes adicionais:

 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Fatura {
	private int id;
	private Cliente cliente;
	private double valor;

	public Fatura(int id, Cliente cliente, double valor) {
		this.id = id;
		this.cliente = cliente;
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public String getClienteNome() {
		return cliente.toString();
	}

	public double getPrecoDescontado() {

		double calculaDesconto = (cliente.getDesconto() * 0.01);
		double desconto = valor - (valor * calculaDesconto);
		return desconto;
	}

	public String toString() {
		DecimalFormat formatador = new DecimalFormat("#.00");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);

		return "Fatura ID: " + getId() + "\nCliente: " + getClienteNome() + "\nValor: R$"
				+ formatador.format(getValor()) + "\nValor com desconto de " + cliente.getDesconto() + "%: R$"
				+ formatador.format(getPrecoDescontado());
	}
}
