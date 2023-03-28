/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste;

/**
 *
 * @author kiki1
 */
public class Teste {

    public static void main(String[] args) {
        LivroDAO livroDao = new LivroDAO();
        Livro livro2  = new Livro(23, 25.84, "jo3rge", "la3la", "23/10/2026", 10, "12/12/2021", "suspense", "343233", "karola", "no sei", "ai que delicia");
        livroDao.cadastrar(livro2);
        //System.out.println(livro1.descricao());
        
        //atualizar 
        //Livro l1 = new Livro(4, 25.80, "jorge", "lala", "23/12/2026", 10, "12/12/2021", "suspense", "343233", "karola", "no sei", "ai que delicia");
        //livroDao.update(l1);
        
        //deletando o contato
        
        //livroDao.deleteByID(4);
        
    }
}
