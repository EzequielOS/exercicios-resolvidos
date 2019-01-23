
public class Preco {
	private double produtoPreco;
	
	public Preco(double produtoPreco){	
		this.produtoPreco = produtoPreco;
	}
	
	public String toString() {
		return  String.format("%s", produtoPreco);
	}
}
