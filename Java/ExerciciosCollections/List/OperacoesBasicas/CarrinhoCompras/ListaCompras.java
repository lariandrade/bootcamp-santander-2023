package Java.ExerciciosCollections.List.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class ListaCompras {

    private List<Item> item;

    public ListaCompras() {
        this.item = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.item.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();

        for (Item produto : item) {
            if(produto.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(produto);
            }
        }
        item.removeAll(itemParaRemover);
    }

    public Double calcularValorTotal() {
        double valorTotal=0d;
        for (Item produto : item) {
            valorTotal+= (produto.getPreco() * produto.getQuantidade());
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(item);
    }

}
