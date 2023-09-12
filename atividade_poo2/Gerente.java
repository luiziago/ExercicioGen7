package atividade_poo2;

public class Gerente extends Funcionario {
    private String setorResponsavel;

    public Gerente(String nome, int idade, String cargo, double salario, String departamento, String setorResponsavel) {
        super(nome, idade, salario, cargo, departamento);
        this.setorResponsavel = setorResponsavel;
    }

    public String getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Setor Responsável: " + setorResponsavel);
    }
}