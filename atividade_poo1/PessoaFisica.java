package atividade_poo1;



public class PessoaFisica extends Cliente {
 private String cpf;

 public PessoaFisica(String nome, int idade, String endereco, String telefone, String email, String cpf) {
     super(nome, idade, endereco, telefone, email);
     this.cpf = cpf;
 }

 public String getCpf() {
     return cpf;
 }

 public void setCpf(String cpf) {
     this.cpf = cpf;
 }

 @Override
 public void visualizar() {
     super.visualizar();
     System.out.println("CPF: " + cpf);
 }
}

