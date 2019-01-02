/*
Nome do autor: Ezequiel Oliveira
Data de criação do arquivo: 21/12/2018
Objetivo sucinto do programa: Programa feito para simular atividades de uma biblioteca
Referência ao enunciado/origem do exercício: Exercicios da Lista 1
Informações adicionais: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/
import java.util.Date;
import java.text.SimpleDateFormat;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private String statusLivro;
    private int quantidadeEmprestimos;

    public Livro(){

    }
    public Livro(int id, String titulo, String autor, Date dataEmprestimo, Date dataDevolucao, String statusLivro, int quantidadeEmprestimos){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.statusLivro = statusLivro;
        this.quantidadeEmprestimos = quantidadeEmprestimos;
    }
    public int getId(){
        return this.id;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public Date getDataEmprestimo(){
        return this.dataEmprestimo;
    }
    public void setDataEmprestimo(Date dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }
    public Date getDataDevolucao(){
        return this.dataDevolucao;
    }
    public void setDataDevolucao(Date dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
    public String getStatusLivro(){
        return this.statusLivro;
    }
    public void setStatusLivro(String statusLivro){
        this.statusLivro = statusLivro;
    }
    public int getQuantidadeEmprestimos(){
        return this.quantidadeEmprestimos;
    }
    public void setQuantidadeEmprestimos(int quantidadeEmprestimos){
        this.quantidadeEmprestimos = quantidadeEmprestimos;
    }
    public String emprestarLivro (){
        if (statusLivro == "disponivel"){
            statusLivro = "emprestado";
            dataEmprestimo = new Date();
            dataDevolucao = new Date(dataEmprestimo.getTime() + (6048 * 100000));
            quantidadeEmprestimos += 1;
            return "O livro \"" + this.titulo + "\" foi emprestado com sucesso.";
        }
        else {
            return "O livro \"" + this.titulo + "\" ja esta emprestado.";
        }
    }
    public String devolverLivro(){
        if (statusLivro == "emprestado"){
            statusLivro = "disponivel";
            dataEmprestimo = new Date();
            dataDevolucao = new Date();
            return "O livro \"" + this.titulo + "\" foi devolvido com sucesso.";
        }
        else {
            return "O livro \"" + this.titulo + "\" nao pode ser devolvido, pois nao esta emprestado.";
        }
    }
    public static String buscarLivro(Livro[] arr, String titulo, String autor){
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        if(arr.length == 0 || arr == null){
            System.out.println("Busca: Insira um argumento valido");
        }
        else{
            for(int i =0; i < arr.length; i++){
                if(arr[i].getTitulo() == titulo && arr[i].getAutor() == autor){
                    System.out.println("-----------------------------------------------------------------------------------"
                    + "\nLivro encontrado com Sucesso !"
                    + "\nid: " + arr[i].getId()
                    + "\nTitulo: " + arr[i].getTitulo()
                    + "\nAutor: " + arr[i].getAutor()
                    + "\ndataEmprestimo: " + formataData.format(arr[i].getDataEmprestimo())
                    + "\ndataDevolucao: " + formataData.format(arr[i].getDataDevolucao())
                    + "\nstatusLivro: " + arr[i].getStatusLivro()
                    + "\nquantidadeEmprestimos: " + arr[i].getQuantidadeEmprestimos());
                }
            }
        }
        return "\n-----------------------------------------------------------------------------------";
    }
    public static String exibirLivrosEmprestados(Livro[] arr){
        if(arr.length == 0 || arr == null){
            System.out.println("Insira um array valido");
        }
        else{
            for(int i =0; i < arr.length; i++){
                if(arr[i].getStatusLivro() == "emprestado"){
                    System.out.println( "\nTitulo do Livro= " + arr[i].getTitulo() + ","
                    + " Autor= " + arr[i].getAutor());
                }
            }
        }
        return "\n-----------------------------------------------------------------------------------";
    }
    public static String exibirLivrosDisponiveis(Livro[] arr){
        if(arr.length == 0 || arr == null){
            System.out.println("Insira um array valido");
        }
        else {
            for(int i =0; i < arr.length; i++){
                if(arr[i].getStatusLivro() != "emprestado"){
                    System.out.println( "\nTitulo do Livro= " + arr[i].getTitulo() + ","
                    + " Autor= " + arr[i].getAutor());
                }
            }
        }
        return "\n-----------------------------------------------------------------------------------";
    }
    public static String exibirLivrosAtrasados(Livro[] arr){
        Date dataAtual = new Date();
        if(arr.length == 0 || arr == null){
            System.out.println("Insira um array valido");
        }
        else {
            for(int i =0; i < arr.length; i++){
                if(dataAtual.compareTo(arr[i].getDataDevolucao()) > 0){
                    long atrasoEmMs = (arr[i].getDataEmprestimo().getTime() - arr[i].getDataDevolucao().getTime());
                    if (atrasoEmMs / 86400000 > 0){
                        System.out.println("\nTitulo do Livro= " + arr[i].getTitulo()
                        + ", Autor= " + arr[i].getAutor()
                        + ", Dias de Atraso: " + (atrasoEmMs / 86400000));
                    }
                }
            }
        }
        return "\n-----------------------------------------------------------------------------------";
    }

    public double gerarMulta(double taxaPorDiaAtrasado){
        Date dataAtual = new Date();
        long atrasoEmMs = 0;

        if( dataAtual.compareTo(this.getDataDevolucao()) > 0){
            atrasoEmMs = (dataAtual.getTime() - this.getDataDevolucao().getTime());
        }
        return ((atrasoEmMs / 86400000) * taxaPorDiaAtrasado);
    }

    public static String exibirLivrosMaisEmprestados(Livro[] arr) {
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        Livro maisEmprestado = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getQuantidadeEmprestimos() > maisEmprestado.getQuantidadeEmprestimos()){
                maisEmprestado = arr[i];
            }
        }
        return "-----------------------------------------------------------------------------------"
        + "\nLivro mais emprestado: "
        + "\nid: " + maisEmprestado.getId()
        + "\nTitulo: " + maisEmprestado.getTitulo()
        + "\nAutor: " + maisEmprestado.getAutor()
        + "\ndataEmprestimo: " + formataData.format(maisEmprestado.getDataEmprestimo())
        + "\ndataDevolucao: " + formataData.format(maisEmprestado.getDataDevolucao())
        + "\nstatusLivro: " + maisEmprestado.getStatusLivro()
        + "\nquantidadeEmprestimos: " + maisEmprestado.getQuantidadeEmprestimos()
        + "\n-----------------------------------------------------------------------------------";
    }

    public String toString() {
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		return "Id: " + this.id
        + "\nTitulo: " + this.titulo
        + "\nAutor: " + this.autor
        + "\nData emprestimo: "	+ formataData.format(dataEmprestimo)
        + "\nData devolucao: " + formataData.format(dataDevolucao)
		+ "\nStatus do livro: " + this.statusLivro
        + "\nQuantidades de emprestimos: "+ this.quantidadeEmprestimos;
	}

}
