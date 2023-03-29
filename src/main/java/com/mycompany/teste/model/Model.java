/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste.model;

import com.mycompany.teste.Livro;
import com.mycompany.teste.LivroDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Erika Santos
 * @author Karolayne Silva
 * @author Gilmar Adrian
 */
public class Model extends AbstractTableModel {

    private List<Livro> dados = new ArrayList<>();
    private String[] colunaStrings = {"atributo1", "atributo2", "atributo3"};

    public Model() {

        dados = LivroDAO.getInstance().findAll();
    }

    @Override
    public String getColumnName(int column) {
        return colunaStrings[column];
    }

    @Override
    public int getRowCount() {
        return dados.size;
    }

    @Override
    public int getColumnCount() {
        return colunaStrings.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getPreco();
            case 2:
                return dados.get(linha).getDescricao();
            case 3:
                return dados.get(linha).getDataRegistro();
            case 4:
                return dados.get(linha).getDataLancamento();
            case 5:
                return dados.get(linha).getGenero();
            case 6:
                return dados.get(linha).getIsbn13();
            case 7:
                return dados.get(linha).getAutor();
            case 8:
                return dados.get(linha).getEditora();
            case 9:
                return dados.get(linha).getSinopse();
        }
        return null;
    }
}
