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
 * @author EDS
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
        return dados.length;
    }

    @Override
    public int getColumnCount() {
        return colunaStrings.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return dados;
    }

}


public class MyTableModel extends AbstractTableModel {
    private String[] columnNames = {"Column 1", "Column 2", "Column 3"};
    private Object[][] data = {
        {"Row 1, Col 1", "Row 1, Col 2", "Row 1, Col 3"},
        {"Row 2, Col 1", "Row 2, Col 2", "Row 2, Col 3"},
        {"Row 3, Col 1", "Row 3, Col 2", "Row 3, Col 3"},
        {"Row 4, Col 1", "Row 4, Col 2", "Row 4, Col 3"}
    };

//    public int getColumnCount() {
//        return columnNames.length;
//    }
//
//    public int getRowCount() {
//        return data.length;
//    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

//    public Object getValueAt(int row, int col) {
//        return data[row][col];
//    }
}