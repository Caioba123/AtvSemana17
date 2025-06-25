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
public class Clientes {
    public static void servico3(Scanner teclado) {
         
         System.out.println("Olá, Bem-vindo");
         System.out.println("Se cadastre no nosso sistema de assinatura!");
         
        		System.out.println("----Clientes----");
       ArrayList<String> clientes1 = new ArrayList<>();
       System.out.print("Quantos clientes você deseja cadastrar?: ");
       int quantidade = teclado.nextInt();
       teclado.nextLine();
       for (int i = 0; i < quantidade; i++) {
           System.out.println("\nCliente " + (i + 1));
           System.out.print("Nome: ");
           String nome = teclado.nextLine();
           System.out.print("Email: ");
           String email = teclado.nextLine();
           System.out.print("Endereço: ");
           String endereco = teclado.nextLine();
           System.out.print("Telefone: ");
           String telefone = teclado.nextLine();
           System.out.print("CPF: ");
           String cpf = teclado.nextLine();
           String dadoCliente = "Nome: " + nome + " | Email: " + email + " | Endereço: " + endereco +
                   " | Telefone: " + telefone + " | CPF: " + cpf ;
           clientes1.add(dadoCliente);
       }
       System.out.println("\nClientes cadastrados:");
       for (String c : clientes1) {
           System.out.println(c);
       }
      
      
       System.out.print("\n Veja os outros clientes cadastrados: ");
       System.out.print("\n------------------------------------------------------------------------------------------------");
       System.out.print("\n Qual Cliente voce quer acessar (1 a 10) digite (11) se quiser ver todos os clientes cadastrados ");
       System.out.print("\n Caso não queira acessar digite (12): ");
       int escolha = teclado.nextInt();
       if (escolha == 1) {
           System.out.print("\n Nome: Sr. Marcelo Souza | CPF: 057.962.483-83 | Telefone: +55 41 9117-1822 | E-mail: luiz-miguelsouza@bol.com.br | Endereço: Vila de da Paz, 66, Ouro Minas, 13315-098 das Neves / AC");
       } else if (escolha == 2) {
           System.out.print("\n Nome: Thales Caldeira | CPF: 310.627.895-12 | Telefone: +55 11 8299-7376 | E-mail: castromarcela@moraes.br | Endereço: Avenida de Castro, 7, Vila Oeste, 13338-726 Freitas / PB");
       } else if (escolha == 3) {
           System.out.print("\n Nome: Breno Pires | CPF: 810.547.632-08 | Telefone: 81 7736 0260 | E-mail: stephany74@uol.com.br | Endereço: Lago da Rosa, 9, Beira Linha, 00978-820 da Mata / AP");
       } else if (escolha == 4) {
           System.out.print("\n Nome: Ana Clara Duarte | CPF: 613.490.582-89 | Telefone: +55 71 3534-6247 | E-mail: alvesana@bol.com.br | Endereço: Favela de Santos, Heliopolis, 51354278 Souza do Sul / RO");
       } else if (escolha == 5) {
           System.out.print("\n Nome: Fernanda Cavalcanti | CPF: 241.058.739-97 | Telefone: 0500-353-4874 | E-mail: pereiramarcos-vinicius@almeida.com | Endereço: Praia de Vieira, 18, Camponesa 2ª Seção, 28059826 Barbosa / MA");
       } else if (escolha == 6) {
           System.out.print("\n Nome: Sr. João Gabriel da Rocha | CPF: 315.649.802-51 | Telefone: +55 (051) 6025-6342 | E-mail: eazevedo@da.org | Endereço: Viaduto da Mota, 55, Santa Lúcia, 45868501 da Luz Verde / GO");
       } else if (escolha == 7) {
           System.out.print("\n Nome: Calebe Pinto | CPF: 596.470.328-38 | Telefone: +55 61 0608-8356 | E-mail: lais51@santos.org | Endereço: Vila Nicolas Vieira, 73, Vila Esplanada, 29946-804 da Rocha das Pedras / SE");
       } else if (escolha == 8) {
           System.out.print("\n Nome: Maria Martins | CPF: 798.514.320-32 | Telefone: +55 21 4895 1343 | E-mail: benjaminbarbosa@ribeiro.br | Endereço: Parque de Sales, 33, Vila Das Oliveiras, 16328708 Costa / PB");
       } else if (escolha == 9) {
           System.out.print("\n Nome: Lucas Gabriel Souza | CPF: 857.496.321-64 | Telefone: +55 (031) 7743-4873 | E-mail: tcardoso@yahoo.com.br | Endereço: Largo Evelyn Cardoso, 42, Miramar, 31665876 da Rocha / TO");
       } else if (escolha == 10) {
           System.out.print("\n Nome: Cliente Exemplo | CPF: 000.000.000-00 | Telefone: (00) 0000-0000 | E-mail: exemplo@email.com | Endereço: Rua Exemplo, 0, Bairro Exemplo, 00000-000 Cidade / UF");
       } else if (escolha == 11) {
           System.out.print("\n Nome: Sr. Marcelo Souza | CPF: 057.962.483-83 | Telefone: +55 41 9117-1822 | E-mail: luiz-miguelsouza@bol.com.br | Endereço: Vila de da Paz, 66, Ouro Minas, 13315-098 das Neves / AC");
           System.out.print("\n Nome: Thales Caldeira | CPF: 310.627.895-12 | Telefone: +55 11 8299-7376 | E-mail: castromarcela@moraes.br | Endereço: Avenida de Castro, 7, Vila Oeste, 13338-726 Freitas / PB");
           System.out.print("\n Nome: Breno Pires | CPF: 810.547.632-08 | Telefone: 81 7736 0260 | E-mail: stephany74@uol.com.br | Endereço: Lago da Rosa, 9, Beira Linha, 00978-820 da Mata / AP");
           System.out.print("\n Nome: Ana Clara Duarte | CPF: 613.490.582-89 | Telefone: +55 71 3534-6247 | E-mail: alvesana@bol.com.br | Endereço: Favela de Santos, Heliopolis, 51354278 Souza do Sul / RO");
           System.out.print("\n Nome: Fernanda Cavalcanti | CPF: 241.058.739-97 | Telefone: 0500-353-4874 | E-mail: pereiramarcos-vinicius@almeida.com | Endereço: Praia de Vieira, 18, Camponesa 2ª Seção, 28059826 Barbosa / MA");
           System.out.print("\n Nome: Sr. João Gabriel da Rocha | CPF: 315.649.802-51 | Telefone: +55 (051) 6025-6342 | E-mail: eazevedo@da.org | Endereço: Viaduto da Mota, 55, Santa Lúcia, 45868501 da Luz Verde / GO");
           System.out.print("\n Nome: Calebe Pinto | CPF: 596.470.328-38 | Telefone: +55 61 0608-8356 | E-mail: lais51@santos.org | Endereço: Vila Nicolas Vieira, 73, Vila Esplanada, 29946-804 da Rocha das Pedras / SE");
           System.out.print("\n Nome: Maria Martins | CPF: 798.514.320-32 | Telefone: +55 21 4895 1343 | E-mail: benjaminbarbosa@ribeiro.br | Endereço: Parque de Sales, 33, Vila Das Oliveiras, 16328708 Costa / PB");
           System.out.print("\n Nome: Lucas Gabriel Souza | CPF: 857.496.321-64 | Telefone: +55 (031) 7743-4873 | E-mail: tcardoso@yahoo.com.br | Endereço: Largo Evelyn Cardoso, 42, Miramar, 31665876 da Rocha / TO");
       } else if (escolha == 12) {
           System.out.println("------------------------------------------------");
       } else {
           System.out.println("Número inválido. Digite de 1 a 12.");
       }
       System.out.println("\nDigite 0 para voltar ao menu:");
       int voltar = teclado.nextInt();
       if (voltar == 0) {
           main.voltaraomain();
       } else {
           System.out.println("Encerrando o programa.");
       }
   } catch (InputMismatchException e) {
       System.out.println("Erro encontrado. Use número inteiro. ");
   } catch (Exception e) {
       System.out.println("Erro inesperado: " + e.getMessage());
   } finally {

}
}
