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
public class LivroDAO {

    public void cadastrar(Livro livro) {

        String sql = "INSERT INTO produto(id, preco, nome, descricao, dataRegistro, dataLancamento, genero) VALUES (?, ?, ?, ?, ?, ?, ?); ";
        String sql_l = "INSERT INTO livro( isbn13, autor, editora, sinopse, Produto_id) VALUES (?, ?, ?, ?, ?) ";
        Connection conn;
        PreparedStatement pstm;
        PreparedStatement pstm_l;

        try {
            //cria uma conexao com o bd
            conn = Conexao.conectar();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm_l = (PreparedStatement) conn.prepareStatement(sql_l);

            //executa a query
            //adiciona os valores que são esperados pela query
            pstm.setInt(1, livro.getId());
            int id = livro.getId();
            pstm.setDouble(2, livro.getPreco());
            pstm.setString(3, livro.getNome());
            pstm.setString(4, livro.getDescricao());
            pstm.setString(5, livro.getDataRegistro());
            pstm.setString(6, livro.getDataLancamento());
            pstm.setString(7, livro.getGenero());

            pstm_l.setString(1, livro.getIsbn13());
            pstm_l.setString(2, livro.getAutor());
            pstm_l.setString(3, livro.getEditora());
            pstm_l.setString(4, livro.getSinopse());
            pstm_l.setInt(5, id);

            pstm.execute();
            pstm_l.execute();
            System.out.println("Livro salvo com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Livro> mostrarLivros() {

        String sql = "SELECT * FROM livraria_livrados.livro INNER JOIN livraria_livrados.produto ON produto.id = livro.Produto_id;";

        ArrayList<Livro> arl_livros = new ArrayList<>();
        Connection conn;
        PreparedStatement pstm;
        //classe que vai recuperar os dados do banco
        ResultSet rs;

        try {
            conn = Conexao.conectar();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
            int cont = 0;

            while (rs.next()) {

                int id = rs.getInt("Produto_id");
                double preco = rs.getDouble("preco");
                String nome = rs.getString("nome");
                String descricao = rs.getString("descricao");
                String dataRegistro = rs.getString("dataRegistro");
                String dataLancamento = rs.getString("dataLancamento");
                String genero = rs.getString("genero");
                String isbn13 = rs.getString("isbn13");
                String autor = rs.getString("autor");
                String editora = rs.getString("editora");
                String sinopse = rs.getString("sinopse");

                Livro obj_livro = new Livro(id, preco, nome, descricao, dataRegistro, dataLancamento, genero, isbn13, autor, editora, sinopse);

                System.out.println(cont + 1 + "º LIVRO");
                System.out.println("Id: " + obj_livro.getId());
                System.out.println("-------------------------");
                System.out.println("Preço: " + obj_livro.getPreco());
                System.out.println("-------------------------");
                System.out.println("Nome: " + obj_livro.getNome());
                System.out.println("-------------------------");
                System.out.println("Descrição: " + obj_livro.getDescricao());
                System.out.println("-------------------------");
                System.out.println("Data de registro: " + obj_livro.getDataRegistro());
                System.out.println("-------------------------");
                System.out.println("Data de lançamento: " + obj_livro.getDataLancamento());
                System.out.println("-------------------------");
                System.out.println("Genêro: " + obj_livro.getGenero());
                System.out.println("-------------------------");
                System.out.println("ISBN13: " + obj_livro.getIsbn13());
                System.out.println("-------------------------");
                System.out.println("Autor:" + obj_livro.getAutor());
                System.out.println("-------------------------");
                System.out.println("Editora:" + obj_livro.getEditora());
                System.out.println("-------------------------");
                System.out.println("Sinopse:" + obj_livro.getSinopse());
                System.out.println("==-==-==-==-==-==-==-==-==");

                arl_livros.add(cont, obj_livro);
                cont++;
            }
            System.out.println(arl_livros);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arl_livros;
    }

    public Livro buscarLivroNome(String nome) {

        String consulta = "SELECT * FROM livraria_livrados.livro INNER JOIN livraria_livrados.produto ON produto.id = livro.Produto_id WHERE nome = ?; ";

        Connection conn;
        PreparedStatement pstm;
        ResultSet rs;
        Livro obj_livro = new Livro(0, 0, nome, "", "", "", "", "", "", "", "");

        try {
            conn = Conexao.conectar();
            pstm = (PreparedStatement) conn.prepareStatement(consulta);
            pstm.setString(0, obj_livro.getNome());
            
            rs = pstm.executeQuery(consulta);
            
            rs.next();

            int id = rs.getInt("Produto_id");
//            Livro obj_livro = new Livro(0, 0, nome, consulta, consulta, nome, nome, nome, nome, nome, nome);
            pstm.execute(consulta);
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj_livro;
    }

    public void update(Livro livro) {
        String sql = "UPDATE livros set, nome = ?, descricao = ?, dataRegistro = ?, preco = ?, genero = ?, isbn13 = ?, autor = ?, editora = ?, sinopse = ?, dataLancamento = ? where id = ?";
        Connection conn;
        PreparedStatement pstm;

        try {
            conn = Conexao.conectar();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
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
        Connection conn;
        PreparedStatement pstm;

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
