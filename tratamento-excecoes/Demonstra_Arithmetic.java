/*
Nome do autor: Ezequiel de Oliveira Sant'ana
Data de criação do arquivo: 02/01/2019
Objetivo sucinto do programa: Programa feito para o uso e aprendizagem de ArithmeticException
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
Informações adicionais:
*/

public class Demonstra_Arithmetic {
    public static void main(String[] args) {
        try{
            int a = 25;
            System.out.println("Resultado=" + a/0);
        }
        catch(ArithmeticException e){
            System.out.println("Impossivel dividir por 0");
        }
    }
}
