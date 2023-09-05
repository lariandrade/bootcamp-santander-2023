package ExerciciosCollections.List.OperacoesBasicas.Tarefas;

/*
 * Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. 
 * Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição.
 * Implemente os seguintes métodos:
 *   - adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
 *   - removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
 *   - obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
 *   - obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.
 */

public class Main {
    public static void main(String[] args) {

        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 2");
        lista.adicionarTarefa("Tarefa 3");
        lista.adicionarTarefa("Tarefa 4");

        lista.removerTarefa("Tarefa 3");

        lista.obterDescricoesTarefas();

        System.out.println("Total de elementos na lista: " + lista.obterNumeroTotalTarefas());

    }
}
