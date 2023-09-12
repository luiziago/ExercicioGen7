package atividade_poo2;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, int idade, String cargo, double salario, String departamento, double comissao) {
        super(nome, idade, salario, cargo, departamento);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Comissão: R$" + comissao);
    }
}