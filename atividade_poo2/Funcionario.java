package atividade_poo2;

public class Funcionario {
	
		 private String nome;
		 private int idade;
		 private double salario;
		 private String cargo;
		 private String departamento;

		 public Funcionario (String nome, int idade, double salario, String cargo, String departamento) {
		     this.nome = nome;
		     this.idade = idade;
		     this.salario = salario;
		     this.cargo = cargo;
		     this.departamento = departamento;
		 }

		 public String getNome() {
		     return nome;
		 }

		 public void setNome(String nome) {
		     this.nome = nome;
		 }

		 public int getIdade() {
		     return idade;
		 }

		 public void setIdade(int idade) {
		     this.idade = idade;
		 }

		 public double getSalario() {
		     return salario;
		 }

		 public void setSalario(double salario) {
		     this.salario = salario;
		 }

		 public String getCargo() {
		     return cargo;
		 }

		 public void setCargo(String cargo) {
		     this.cargo = cargo;
		 }

		 public String getDepartamento() {
		     return departamento;
		 }

		 public void setDepartamento(String departamento) {
		     this.departamento = departamento;
		 }

		 public void visualizar() {
		     System.out.println("Nome: " + nome);
		     System.out.println("Idade: " + idade);
		     System.out.println("Salario: " + salario);
		     System.out.println("Cargo: " + cargo);
		     System.out.println("Departamento: " + departamento);
		 }
		}
