import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefa {
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Tarefa> tarefasConcluidas;
    private RepositoriodeTarefasDisco repo;

    public GerenciadorTarefa() {
        this.tarefas = new ArrayList<>();
        this.tarefasConcluidas = new ArrayList<>();
        this.repo = new RepositoriodeTarefasDisco() {};
        carregarTarefas();
    }
    
    public void limparTarefasConcluidas() {
        tarefasConcluidas.clear();
    }
    
    public void adicionarTarefa(String descricao, boolean concluida) {
        Tarefa tarefa = new Tarefa(descricao, concluida);
        tarefas.add(tarefa);
    }
    
    public void carregarTarefas() {
        this.tarefas.addAll(repo.carregarTarefas());
    }
    
    public void imprimirTarefas() {
  
    }
    
    public void getTarefa() {

    }
}
