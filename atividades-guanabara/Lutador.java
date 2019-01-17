/*
Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criação do arquivo: 16/01/2019
Objetivo sucinto do arquivo: Programa simula uma possivel luta
Referência: https://www.youtube.com/watch?v=GLHbxDU9iBA&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&t=0s&index=150
Informações adicionais:
*/

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public void apresentar(){

    }
    public void ganharLuta(){
        
    }
    public void perderLuta(){

    }
    public void empatarLuta(){

    }

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.peso = pe;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    
}
