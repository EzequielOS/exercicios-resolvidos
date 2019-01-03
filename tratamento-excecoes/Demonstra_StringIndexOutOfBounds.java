/*
Nome do autor: Ezequiel de Oliveira Sant'ana
Data de criação do arquivo: 03/01/2019
Objetivo sucinto do programa: Programa feito para o uso e aprendizagem de StringIndexOutOfBoundsException
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
Informações adicionais:
*/
public class Demonstra_StringIndexOutOfBounds {
    public static void main(String[] args) {
        try{
            String buzz = "Ao infinito e alem";
            System.out.print(buzz.charAt(23));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Nao ha possibilidade de indices na variavel");
        }
    }
}
