/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criação do arquivo: 31/01/2019
Objetivo sucinto do programa: Arquivo implementa metodo equals()
Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/1Znd6TTkM0lh0M9vUTP1yVve8KSKEn8TlKzfJf8zyX9U/edit 
Informações adicionais: 

 */

public class TestaAutorLivro {
	public static void main(String[] args) {
		Autor ziraldo = new Autor("Ziraldo", "ziraldomaluquinho00@gmail.com", 'f');
		Autor ziraldo2 = new Autor("Ziraldo", "ziraldomaluquinho00@gmail.com", 'm');
		Autor ziraldo3 = new Autor("Ziraldo", "zeraldo11@gmail.com", 'f');
		
		Livro meninoMaluquinho = new Livro("Menino Maluquinho", ziraldo, 49.89);
		
		System.out.println("1" + ziraldo + "\n2" + ziraldo2 + "\n3" + ziraldo3);
		System.out.println();
		
		System.out.println("ziraldo2 equals ziraldo: "+ ziraldo2.equals(ziraldo));
		System.out.println("ziraldo2 equals ziraldo3: "+ ziraldo2.equals(ziraldo3));
		System.out.println("ziraldo2 == ziraldo: " + (ziraldo2 == ziraldo));
		
	}
}
