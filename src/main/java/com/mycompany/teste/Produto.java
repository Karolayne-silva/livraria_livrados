/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

/**
 *
 * @author Erika Santos
 * @author Karolayne Silva
 * @author Gilmar Adrian
 */
public class Produto {

    private int id;
    private double preco;
    private String nome;
    private String descricao;
    private String dataRegistro;
    private String dataLancamento;
    private String genero;

    public Produto(int id, double preco, String nome, String descricao, String dataRegistro, String dataLancamento, String genero) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
        this.descricao = descricao;
        this.dataRegistro = dataRegistro;
        this.dataLancamento = dataLancamento;
        this.genero = genero;
    }

    // Construtor usado pelo construtor de Livro, em que só são necessários o Id e o Preço
    public Produto(int id, double preco) {
        this.id = id;
        this.preco = preco;
    }

    public String descricao() {
        return "Produto [id=" + id + ", preco=" + preco + ", nome=" + nome + ", descricao=" + descricao
                + ", dataRegistro=" + dataRegistro + ", dataLancamento=" + dataLancamento
                + ", genero=" + genero + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
