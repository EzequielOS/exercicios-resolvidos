/*
Nome do autor: Ezequiel de Oliveira Sant'ana
Data de criação do arquivo: 03/01/2019
Objetivo sucinto do programa: Programa feito para o uso e aprendizagem de NumberFormatException
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
Informações adicionais:
*/
public class Demonstra_NumberFormat {
    public static void main(String[] args) {
        try{
            int ue = Integer.parseInt("aehoo");
            System.out.println(ue);
        }
        catch(NumberFormatException e){
            System.out.println("Falha ao converter variavel");
        }
    }
}
