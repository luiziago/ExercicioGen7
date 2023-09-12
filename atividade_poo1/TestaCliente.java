package atividade_poo1;


public class TestaCliente {
public static void main(String[] args) {
  
   PessoaFisica pf1 = new PessoaFisica("Iago", 22, "Rua A, 444", "21 9877-7890", "iago@gmail.com", "123.456.789-10");
   PessoaFisica pf2 = new PessoaFisica("Luiz", 25, "Rua B, 777", "21 9654-3210", "luiz@gmail.com", "987.654.321-11");

  
   PessoaJuridica pj1 = new PessoaJuridica("Empresa A", 10, "Av. X, 000", "21 5555-5555", "empresaA@gmail.com", "123");
   PessoaJuridica pj2 = new PessoaJuridica("Empresa B", 5, "Av. Y, 987", "21 6666-6666", "empresaB@gmail.com", "456");

   
   System.out.println("Dados da Pessoa Física 1:");
   pf1.visualizar();

   System.out.println("\nDados da Pessoa Física 2:");
   pf2.visualizar();

   System.out.println("\nDados da Pessoa Jurídica 1:");
   pj1.visualizar();

   System.out.println("\nDados da Pessoa Jurídica 2:");
   pj2.visualizar();
}
}

