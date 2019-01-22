import java.awt.DisplayMode;
import java.util.ArrayList;

public class ArrayListColecao {
	public static void main(String[] args) {
		ArrayList<String> itens = new ArrayList<String>();

		itens.add("red");
		itens.add(0, "yellow");

		System.out.println("Exibir conteúdo da lista com loop controlado por contador:");

		for (int i = 0; i < itens.size(); i++)
			System.out.printf(" %s", itens.get(i));

		display(itens, "\nExiba o conteúdo da lista com a declaração aprimorada:");

		itens.add("green");
		itens.add("yellow");
		display(itens, "Lista com dois novos elementos");

		itens.remove("yellow");
		display(itens, "Remove indice 0 ");

		itens.remove(1);
		display(itens, "Remove indice 1");

		System.out.printf("\"red\" esta %sna lista%n", itens.contains("red") ? "" : "nao");

		System.out.printf("Tamanho: %s%n", itens.size());
	}

	public static void display(ArrayList<String> itens, String header) {
		System.out.println(header);

		for (String item : itens) {
			System.out.printf(" %s", item);

			System.out.println();
		}
	}
}