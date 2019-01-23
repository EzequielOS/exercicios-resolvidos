
public class Produto {
	private String alimento;
	private String bebida;
	private Preco precoBebida;
	private Preco precoAlimento;
	
	public Produto(String alimento, String bebida, Preco precoBebida, Preco precoAlimento) {
		this.alimento = alimento;
		this.bebida = bebida;
		this.precoBebida = precoBebida;
		this.precoAlimento = precoAlimento;
		
	}

	public String toString() {
		return String.format("Alimento: %s \nBebida: %s \nPreco da Bebida = %s \nPreco Alimento =  %s ", alimento, bebida, precoBebida, precoAlimento);

	}

}
