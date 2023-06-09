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
public class Livro extends Produto {

    private String isbn13;
    private String autor;
    private String editora;
    private String sinopse;

    public Livro(int id, double preco, String nome, String descricao, String dataRegistro, String dataLancamento, String genero, String isbn13, String autor, String editora, String sinopse) {
        super(id, preco, nome, descricao, dataRegistro, dataLancamento, genero);
        this.isbn13 = isbn13;
        this.autor = autor;
        this.editora = editora;
        this.sinopse = sinopse;

    }

    // Construtor usado na função update
    public Livro(int id, double preco) {
        super(id, preco);
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "livro" + super.toString() + "isbn13=" + isbn13 + ", autor=" + autor + ", editora=" + editora + ", sinopse=" + sinopse + "]";
    }

}
