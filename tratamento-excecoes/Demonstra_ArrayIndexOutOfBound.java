/*
Nome do autor: Ezequiel de Oliveira Sant'ana
Data de criação do arquivo: 02/01/2019
Objetivo sucinto do programa: Programa feito para o uso e aprendizagem de ArrayIndexOutOfBoundException
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
Informações adicionais:
*/

public class Demonstra_ArrayIndexOutOfBound {
    public static void main(String[] args) {
        try{
            int[] arr = {3, 6, 5, 5, 4};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Corrija o indice do array");
        }
    }
}
