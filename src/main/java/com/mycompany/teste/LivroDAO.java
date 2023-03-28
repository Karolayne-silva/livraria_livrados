/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Karolayne Silva
 * @author Erika Santos
 * @author Gilmar Adrian
 *
 */
/**
 * CRUD create read update delete
 */
public class LivroDAO {

    public void cadastrar(Livro livro) {
        String sql = "INSERT INTO livros(id, preco, nome, descricao, dataRegistro, quantidade, dataLancamento, genero, isbn13, autor, editora, sinopse) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
        Connection conn;
        PreparedStatement pstm;

        try {
            //cria uma conexao com o bd
            conn = Conexao.conectar();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            //executa a query

            //adiciona os valores que são esperados pela query
            pstm.setInt(1, livro.getId());
            pstm.setDouble(2, livro.getPreco());
            pstm.setString(3, livro.getNome());
            pstm.setString(4, livro.getDescricao());
            pstm.setString(5, livro.getDataRegistro());
            pstm.setInt(6, livro.getQuantidade());
            pstm.setString(7, livro.getDataLancamento());
            pstm.setString(8, livro.getGenero());
            pstm.setString(9, livro.getIsbn13());
            pstm.setString(10, livro.getAutor());
            pstm.setString(11, livro.getEditora());
            pstm.setString(12, livro.getSinopse());

            pstm.execute();
            System.out.println("Livro salvo com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Livro> mostrarLivros() {

        String sql = "SELECT * FROM livros";

        List<Livro> livros = new ArrayList<>();
        Connection conn;
        PreparedStatement pstm;

        //classe que vai recuperar os dados do banco
        ResultSet rs;

        try {
            conn = Conexao.conectar();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rs = pstm.executeQuery(sql);

            while (rs.next()) {
                
                System.out.println(rs.getInt("Id"));
                System.out.println(rs.getString("nome"));
                
//                Livro 1 = new Livro();
//                l.setId(rs.getInt("id"));
//                l.setPreco(rs.getDouble("preco"));
//                l.setNome(rs.getString("nome"));
//                l.setDescricao(rs.getString("descricao"));
//                l.setDataRegistro(rs.getString("dataRegistro"));
//                l.setQuantidade(rs.getInt("quantidade"));
//                l.setDataLancamento(rs.getString("dataLancamento"));
//                l.setGenero(rs.getString("genero"));
//                l.setIsbn13(rs.getString("isbn13"));
//                l.setAutor(rs.getString("autor"));
//                l.setEditora(rs.getString("editora"));
//                l.setSinopse(rs.getString("sinopse"));

//                livros.add(l);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return livros;
    }

    public void update(Livro livro) {
        String sql = "UPDATE livros set quantidade = ?, nome = ?, descricao = ?, dataRegistro = ?, preco = ?, genero = ?, isbn13 = ?, autor = ?, editora = ?, sinopse = ?, dataLancamento = ? where id = ?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = Conexao.conectar();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setInt(1, livro.getQuantidade());
            pstm.setInt(2, livro.getId());
            pstm.setString(3, livro.getNome());
            pstm.setString(4, livro.getDescricao());
            pstm.setString(5, livro.getDataRegistro());
            pstm.setDouble(6, livro.getPreco());
            pstm.setString(7, livro.getGenero());
            pstm.setString(8, livro.getIsbn13());
            pstm.setString(9, livro.getEditora());
            pstm.setString(10, livro.getSinopse());
            pstm.setString(11, livro.getDataLancamento());

            pstm.execute();
            System.out.println("Livro atualizado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteByID(int id) {
        String sql = "DELETE FROM livros WHERE id = ?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = Conexao.conectar();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setInt(1, id);
            pstm.execute();

            System.out.println("Livro deletado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
