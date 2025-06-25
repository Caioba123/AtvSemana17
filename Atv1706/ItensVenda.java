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
public class ItensVenda {
    public static void servico6(Scanner teclado) {
         
         System.out.println("Olá, Bem-vindo");
         System.out.println("Se cadastre no nosso sistema de assinatura!");
         
        System.out.println("Digite o ID da venda:");
        int idVenda = scanner.nextInt();

        System.out.println("Digite o ID do produto:");
        int idProduto = scanner.nextInt();

        System.out.println("Digite a quantidade:");
        int quantidade = scanner.nextInt();

        System.out.println("Digite o preço unitário:");
        double precoUnitario = scanner.nextDouble();

        System.out.println("Digite o subtotal:");
        double subtotal = scanner.nextDouble();

        System.out.println("\nDados do item da venda:");
        System.out.println("ID da venda: " + idVenda);
        System.out.println("ID do produto: " + idProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: R$ " + precoUnitario);
        System.out.println("Subtotal: R$ " + subtotal);

         
}
}

