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
public class Assinatura {
     public static void servico1(Scanner teclado) {
         
         System.out.println("Ola, Bem-vindo");
         System.out.println("Se cadastre no nosso sistema de assinatura!");
         
         Scanner tec = new Scanner(System.in);
         System.out.println("Diga seu nome");
         String nome = tec.nextLine();
         System.out.println("-----------------------");
         System.out.println("Temos 3 tipos de planos");
         System.out.println("Plano Free:");
         System.out.println("Plano Medium:");
         System.out.println("Plano Premium:");
         
         System.out.println("Diga o plano que voce deseja:");
         String plano = tec.nextLine();
         System.out.println("-----------------------");
         
         System.out.println("Diga o seu email");
         String email = tec.nextLine();
         System.out.println("-----------------------");
         
         System.out.println("Diga o seu telefone");
         String telefone = tec.nextLine();
         System.out.println("-----------------------");
         
         System.out.println("Diga o id da sua empresa");
         String id_empresa = tec.nextLine();
         System.out.println("-----------------------");
         
         
         System.out.println("Nome: " +nome);
         System.out.println("Plano: " +plano);
         System.out.println("Email: " +email);
         System.out.println("Telefone: " +telefone);
         System.out.println("Id da Empresa: " +id_empresa);
         
         System.out.println("Obrigado por se cadastrar! Enviaremos o comprovante para o seu email! :) ");
}
}
