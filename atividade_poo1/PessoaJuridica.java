package atividade_poo1;

public class PessoaJuridica extends Cliente {
private String cnpj;

public PessoaJuridica(String nome, int idade, String endereco, String telefone, String email, String cnpj) {
   super(nome, idade, endereco, telefone, email);
   this.cnpj = cnpj;
}

public String getCnpj() {
   return cnpj;
}

public void setCnpj(String cnpj) {
   this.cnpj = cnpj;
}

@Override
public void visualizar() {
   super.visualizar();
   System.out.println("CNPJ: " + cnpj);
}
}
