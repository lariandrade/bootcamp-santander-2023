package Java.ExerciciosCollections.Set.Pesquisa.Tarefas;

/*
 * Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. 
 * Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:
 * - adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
 * - removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
 * - exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
 * - contarTarefas(): Conta o número total de tarefas na lista de tarefas.
 * - obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
 * - obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
 * - marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.
 * - marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
 * - limparListaTarefas(): Remove todas as tarefas da lista de tarefas.
 */
public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
        listaTarefas.exibirTarefas();

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }
}
