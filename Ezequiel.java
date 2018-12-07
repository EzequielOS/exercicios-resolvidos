/*
Nome do Autor: Ezequiel de Oliveira Sant'ana
Data da criação do arquivo: 06/12/2018
Objetivo sucinto do programa: Programa para demonstração do uso de THIS (Programação Orientada a Objetos)
Referencia ao enunciado/origem do exercício: Exercicío prático com THIS
https://docs.google.com/forms/d/e/1FAIpQLSckb5FSZXqMVsgf3gF831PDLcp0iZySindzJ1P4hkZq7wg0og/viewform
Informações adicionais:https://goo.gl/MaSygR
*/
public class Ezequiel {
    int altura = 170;
    int idade = 18;

    Ezequiel(int idade, int altura){
        this.idade = idade;
        this.altura = altura;
    }

    public static void main(String[] args) {
        Ezequiel crianca = new Ezequiel(8, 120);
        Ezequiel adolescente = new Ezequiel(12, 136);

        System.out.println("Crianca tem: " + crianca.idade + " anos e " + crianca.altura + "cm.");
        System.out.println("Adolescente tem: " + adolescente.idade + " anos e " + adolescente.altura + "cm.");
    }
}
