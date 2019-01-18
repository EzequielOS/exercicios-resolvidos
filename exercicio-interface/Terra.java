
public class Terra implements Planeta {

	String estacoes;
	
	
	public int calcularRotacao (int dias) {
		return(dias * 24);
	}
	
//	public int calcularTranslacao (int anos) {
//		return(anos * (24 * 365));
//	}
/*
 * Terra.java:2: error: Terra is not abstract and does not override abstract method calcularTranslacao(int) in Planeta
public class Terra implements Planeta {
       ^
1 error

 *Erro ocorre quando não se usa um metodo declarado na interface. */
			
	public void definirEstacao (int estacao) {
		switch (estacao) {
		case 1:
			estacoes = "Primavera";
			break;
		case 2:
			estacoes = "Verao";
			break;
		case 3:
			estacoes = "Outono";
			break;
		case 4:
			estacoes = "Inverno";
			break;
		default:
			System.out.println("O valor da estacao deve ser entre 1 e 4");
			break;
		}
	}
	
	
	public static void main(String[] args) {
		
	}
}
