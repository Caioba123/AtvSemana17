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
public class Recebimentos {
       public static void servico11(Scanner teclado) {
         
         System.out.println("Olá, Bem-vindo");
         System.out.println("Se cadastre no nosso sistema de assinatura!");
         
       	try {
		System.out.println("----Recebimentos-----");
		       Scanner sc = new Scanner(System.in);
		       ArrayList<String> produtos1 = new ArrayList<>();
		       System.out.println("Quantos recebimentos foram realizados?");
		       int quantidade = sc.nextInt();
		       sc.nextLine();
		       for (int i = 0; i < quantidade; i++) {
		           System.out.println("\n recebimento " + (i+1));
		           System.out.print("De onde veio o produto?: ");
		           String endereço = sc.nextLine();
		           System.out.print("data que foi enviado o produto: ");
		           int data = sc.nextInt();
		           System.out.print("Produto veio danificado?: ");
		           String danificado = sc.nextLine();
		           System.out.print("Quantidade de produtos recebidos: ");
		           int quatidadeenviados = sc.nextInt();
		           String produtos = "Endereço do encaminhamento: " + endereço + " | o produto veio danificado?: " + danificado + "data de envio do produto" + data + "quantos itens vieram?" + quatidadeenviados;
		          
		           produtos1.add(produtos);
		       }
		       System.out.println("\n Produtos cadastrados:");
		       for (String p : produtos1) {
		           System.out.println(p);
		       }
		     
		       System.out.println("\n\n Digite 0 para voltar ao menu:");
		       int voltar = teclado.nextInt();
		       if (voltar == 0) {
		           main.voltaraomain();
		       } else {
		           System.out.println("Numero invalido");
		       }
		     
	  } catch (InputMismatchException e) {
         System.out.println("Erro encontrado. Use numero inteiro. ");
     } catch (Exception e) {
         System.out.println("Erro inesperado: " + e.getMessage());
     } finally {
         
}
}

