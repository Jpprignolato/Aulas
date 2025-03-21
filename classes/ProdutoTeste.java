package classes;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook");
        //p1.nome = "Notebook";
        p1.preco = 4000;
        p1.desconto = 10;

        var p2 = new Produto("Caneta Preta");
        //p2.nome = "Caneta Preta";
        p2.preco = 2.28;
        p2.desconto = 15;

        double desconto = p1.precoComDesconto();
        System.out.println("Nome do Produto: " + p1.nome);
        System.out.println("Valor do produto R$: " + p1.preco);
        System.out.println("Valor do desconto: " + p1.desconto + "%");
        System.out.println("Valor do desconto R$: "+ p1.precoComDesconto());
        System.out.println("Valor do Produto com desconto R$: "+ (p1.preco - p1.precoComDesconto()));

        double desconto2 = p2.precoComDesconto();
        System.out.println("\n\nNome do Produto: " + p2.nome);
        System.out.println("Valor do produto R$: " + p2.preco);
        System.out.println("Valor do desconto: " + p2.desconto + "%");
        System.out.println("Valor do desconto R$: "+ p2.precoComDesconto());
        System.out.println("Valor do Produto com desconto R$: "+ (p2.preco - p2.precoComDesconto()));
    }
}
