
public class Consumidor {
	public static void main(String[] args) {
		
		Preco bebida1 = new Preco(2.50);
		Preco alimento1 = new Preco(4.00);
		
		
		


				
		Produto compra = new Produto("CupNodlles", "Coca Plus Cafeina", bebida1, alimento1);
		
		System.out.println(compra);
		
			

	}
}
