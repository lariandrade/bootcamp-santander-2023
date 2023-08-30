package Java.ExerciciosCollections.List.OperacoesBasicas.CarrinhoCompras;

/*
 * Crie uma classe chamada "ListaCompras" que representa um carrinho de compras online. 
 * O carrinho deve ser implementado como uma lista de itens.
 * Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade. 
 * Implemente os seguintes métodos:
 * - adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
 * - removerItem(String nome): Remove um item do carrinho com base no seu nome.
 * - calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
 * - exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
 */

public class Main {
    public static void main(String[] args) {
        ListaCompras listaCompra = new ListaCompras();
        
        listaCompra.adicionarItem("Sapato", 240d, 1);
        listaCompra.adicionarItem("Camisa", 50d, 2);
        listaCompra.adicionarItem("Meia", 25d, 4);
        listaCompra.adicionarItem("Chinelo", 30d, 2 );

        System.out.println("Valor total: " + listaCompra.calcularValorTotal());

        listaCompra.removerItem("Sapato");

        System.out.println("Valor total: " + listaCompra.calcularValorTotal());

        listaCompra.exibirItens();
        
    }
}
