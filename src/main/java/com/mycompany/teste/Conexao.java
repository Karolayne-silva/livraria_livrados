
package com.mycompany.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kiki1
 */
// classe usada para conectar e desconectar o banco de dados

public class Conexao {
        
    /**
     *
     * @return
     * @throws Exception
     */
    private static Connection conn = null;
    
    public static Connection conectar(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
             //cria a conexao com o banco de dados
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bancoteste", "root", "teste");
            
            System.out.println("Conectou no banco de dados");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro: Não conseguiu conectar no BD.");
        }
        return conn;
    }
           
       
}
    
 
