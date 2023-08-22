package Java.ExerciciosCollections.List.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class ListaCompras {

    private List<Item> item;

    public ListaCompras() {
        this.item = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        item.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover;

        for (Item produto : item) {
            if(item.)
        }
    }

}
