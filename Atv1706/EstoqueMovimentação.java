/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atv1706;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class EstoqueMovimentação {
    public static void servico5(Scanner teclado) {
         
         System.out.println("Olá, Bem-vindo");
         System.out.println("Se cadastre no nosso sistema de Estoque!");
         
        System.out.println("Digite a descrição do produto:");
        String descricao = scanner.nextLine();

        System.out.println("Digite o preço de venda:");
        double precoVenda = scanner.nextDouble();

        System.out.println("Digite o preço de custo:");
        double precoCusto = scanner.nextDouble();

        System.out.println("Digite o ID da categoria:");
        int idCategoria = scanner.nextInt();

        System.out.println("Digite a quantidade em estoque:");
        int quantidadeEstoque = scanner.nextInt();

        // Exibindo as informações do produto
        System.out.println("\nProduto cadastrado:");
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço de venda: R$ " + precoVenda);
        System.out.println("Preço de custo: R$ " + precoCusto);
        System.out.println("ID da categoria: " + idCategoria);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);

         
}
}
