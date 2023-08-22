package Java.ExerciciosCollections.List;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefa;

    public ListaTarefas() {
        this.tarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {

        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa t : tarefasParaRemover) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        
        tarefa.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefa.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefa);
    }

}