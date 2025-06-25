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
public class LogsAcesso {
       public static void servico7(Scanner teclado) {
         
         System.out.println("Olá, Bem-vindo");
         
       System.out.println("\n---- Logs de Acesso ----");
       System.out.print("Usuário: ");
       String user = sc.nextLine();
       System.out.print("Ação realizada: ");
       String acao = sc.nextLine();
       System.out.print("Data e hora (dd/MM/yyyy hh:mm): ");
       String dataHora = sc.nextLine();
       System.out.printf("Log: usuário=%s | ação=%s | dataHora=%s%n", user, acao, dataHora);
         
}
}
