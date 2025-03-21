package classes;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial) {
        nome = nomeInicial;
    }
    double precoComDesconto() {
        return preco * desconto / 100;
    }

}
