package Java.ExerciciosCollections.Set.Pesquisa.Tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println(tarefaSet.size());
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equals(descricao)) {
                t.setConcluido(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equals(descricao)) {
                t.setConcluido(false);
                break;
            }
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
          if (t.isConcluido()) {
            tarefasConcluidas.add(t);
          }
        }
        return tarefasConcluidas;
      }
    
      public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
          if (!t.isConcluido()) {
            tarefasNaoConcluidas.add(t);
          }
        }
        return tarefasNaoConcluidas;
      }

      public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
          for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
              tarefaParaRemover = t;
              break;
            }
          }
          tarefaSet.remove(tarefaParaRemover);
        } 
      }
    

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    
}
