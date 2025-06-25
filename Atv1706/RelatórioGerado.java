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
public class RelatórioGerado {
       public static void servico12(Scanner teclado) {
         
         System.out.println("Olá, Bem-vindo");
         System.out.println("Se cadastre no nosso sistema de assinatura!");
         
        try {
		System.out.println("----Relatorios-----");
		       Scanner sc = new Scanner(System.in);
		       ArrayList<String> produtos1 = new ArrayList<>();
		       System.out.println("quantos relatorios voce quer fazer?");
		       int quantidade = sc.nextInt();
		       sc.nextLine();
		       for (int i = 0; i < quantidade; i++) {
		           System.out.println("\n relatorio " + (i+1));
		  
		           System.out.print("data que foi enviado o produto: ");
		           int data = sc.nextInt();        
		           System.out.print("Valor de produtos recebidos: ");
		           int valor = sc.nextInt();
		           String produtos = "data que foi enviado o produto: " + data + " | Valor de produtos recebidos: " + valor ;
		          
		           produtos1.add(produtos);
		       }
		       System.out.println("\n relatorios confirmados:");
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

