/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.teste;

import java.util.Scanner;

/**
 *
 * @author Erika Santos
 * @author Karolayne Silva
 * @author Gilmar Adrian
 */
public class Teste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo a Livraria LIVRADOS!");
        System.out.println("Digite seu login:");
        System.out.println("Login: ");
        //String login = sc.next();
        System.out.println("Senha: ");
        //String senha = sc.next();

        while (true) {
            System.out.println("O que deseja fazer ? ");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("[1] CADASTRAR ");
            System.out.println("[2] ATUALIZAR");
            System.out.println("[3] DELETAR");
            System.out.println("[4] MOSTRAR TODOS OS LIVROS");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            int numero = sc.nextInt();

            switch (numero) {
                case 1 -> {
                    LivroDAO ld = new LivroDAO();

                    System.out.println("CADASTRO DE LIVRO");
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Preço: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Descrição: ");
                    String desc = sc.nextLine();
                    System.out.println("Data de registro: ");
                    String dataR = sc.next();
                    sc.nextLine();
                    System.out.println("Data de lançamento: ");
                    String dataL = sc.next();
                    System.out.println("Genêro: ");
                    String genero = sc.next();
                    System.out.println("ISBN13: ");
                    String isbn = sc.next();
                    System.out.println("Autor: ");
                    String autor = sc.next();
                    System.out.println("Editora: ");
                    String editora = sc.next();
                    sc.nextLine();
                    System.out.println("Sinopse: ");
                    String sinopse = sc.nextLine();

                    Livro livro = new Livro(id, preco, nome, desc, dataR, dataL, genero, isbn, autor, editora, sinopse);
                    ld.cadastrar(livro);
                    break;
                }
                case 2 -> {
                    System.out.println("ATUALIZAR LIVRO");
                    LivroDAO ld = new LivroDAO();
//                   escolher o dado
//                   pesquisa de apenas um registro
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    System.out.println("Preço  ");
                    double preco = sc.nextDouble();
                    System.out.println("Nome: ");
                    String nome = sc.next();
                    System.out.println("Descrição: ");
                    String desc = sc.nextLine();
                    System.out.println("Data de registro: ");
                    String dataR = sc.next();
                    System.out.println("Data de lançamento: ");
                    String dataL = sc.next();
                    System.out.println("Genêro: ");
                    String genero = sc.next();
                    System.out.println("ISBN13: ");
                    String isbn = sc.next();
                    System.out.println("Autor: ");
                    String autor = sc.next();
                    System.out.println("Editora: ");
                    String editora = sc.next();
                    System.out.println("Sinopse: ");
                    String sinopse = sc.nextLine();

                    Livro livro = new Livro(id, preco, nome, desc, dataR, dataL, genero, isbn, autor, editora, sinopse);
                    ld.update(livro);
                    break;
                }

                case 3 -> {
                    System.out.println("DELETAR LIVRO");
                    LivroDAO ld = new LivroDAO();
                    System.out.println("Digite o ID do livro que deseja deletar: ");
                    int cod = sc.nextInt();
                    ld.deleteByID(cod);
                    break;
                }
                case 4 -> {
                    System.out.println("MOSTRAR TODOS OS LIVROS");
                    LivroDAO livro = new LivroDAO();
                    livro.mostrarLivros();
                    break;
                }
                
                default -> {
                    System.out.println("Digite um número válido");
                }

            }

        }

    }
}
