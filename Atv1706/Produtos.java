/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atv1706;

import java.util.Scanner;
import java.util.ArrayList; 
import java.util.InputMismatchException;

/**
 *
 * @author Aluno
 */
public class Produtos {
       public static void servico10(Scanner teclado) {
         
         System.out.println("Olá, Bem-vindo");
         System.out.println("Se cadastre no nosso sistema de assinatura!");
         
          Scanner sc = new Scanner(System.in);
            ArrayList<String> listaProdutos = new ArrayList<>();

            System.out.println("Quantos produtos você deseja cadastrar?");
            int quantidade = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            for (int i = 0; i < quantidade; i++) {
                System.out.println("\nProduto " + (i + 1));
                
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Descrição: ");
                String descricao = sc.nextLine();

                System.out.print("Preço de venda: ");
                String precoVenda = sc.nextLine();

                System.out.print("Preço de custo: ");
                String precoCusto = sc.nextLine();

                System.out.print("Quantidade no estoque: ");
                String quantidadeEstoque = sc.nextLine();

                String produtoFormatado = "Nome: " + nome +
                        " | Descrição: " + descricao +
                        " | Preço de venda: " + precoVenda +
                        " | Preço de custo: " + precoCusto +
                        " | Quantidade em estoque: " + quantidadeEstoque;

                listaProdutos.add(produtoFormatado);
            }

            System.out.println("\nProdutos cadastrados:");
            for (String produto : listaProdutos) {
                System.out.println(produto);
            }

            System.out.println("\nDigite 0 para voltar ao menu:");
            int voltar = teclado.nextInt();
            
            if (voltar == 0) {
                main.voltaraomain(); // Certifique-se que 'main' está correto.
            } else {
                System.out.println("Número inválido.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro encontrado. Use número inteiro.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } 

}
}

