package atividade_poo2;


public class TestaFuncionario {
    public static void main(String[] args) {
        
        Gerente gerente1 = new Gerente("Iago", 22, "Gerente de Vendas", 8000.0, "Vendas", "Vendas Internas");
        Gerente gerente2 = new Gerente("Luiz", 25, "Gerente de Marketing", 7500.0, "Marketing", "Marketing Digital");

        
        Vendedor vendedor1 = new Vendedor("João", 28, "Vendedor Externo", 3500.0, "Vendas", 500.0);
        Vendedor vendedor2 = new Vendedor("Maria", 30, "Vendedora Interna", 3800.0, "Vendas", 400.0);

        
        System.out.println("Dados do Gerente 1:");
        gerente1.visualizar();

        System.out.println("\nDados do Gerente 2:");
        gerente2.visualizar();

        System.out.println("\nDados do Vendedor 1:");
        vendedor1.visualizar();

        System.out.println("\nDados do Vendedor 2:");
        vendedor2.visualizar();
    }
}