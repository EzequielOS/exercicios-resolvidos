/*
Nome do autor: Ezequiel de Oliveira Sant'ana
Data de criação do arquivo: 03/01/2019
Objetivo sucinto do programa: Programa feito para o uso e aprendizagem de NullPointerException
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
Informações adicionais:
*/
public class Demonstra_NullPointer {
    public static void main(String[] args) {
        try{
            String x = null;
            System.out.print(x.charAt(3));
        }
        catch(NullPointerException e){
            System.out.println("Nao ha indices em valores null");
        }
    }
}
