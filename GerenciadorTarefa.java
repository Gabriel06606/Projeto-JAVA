import java.util.ArrayList;

public class GerenciadorTarefa {
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Tarefa> tarefasConcluidas;
    private RepositoriodeTarefasDisco repo;
    private boolean concluida;
    private String descricao;

    public GerenciadorTarefa() {
        this.tarefas = new ArrayList<>();
        this.tarefasConcluidas = new ArrayList<>();
        this.repo = new RepositoriodeTarefasDisco() {}; //instanciando
        carregarTarefas();
    }
    
    public void limparTarefasConcluidas() {
        tarefasConcluidas.clear();
    }
    
    public void adicionarTarefa(String descricao, boolean concluida) {
        Tarefa tarefa = new Tarefa(descricao, false);
        tarefas.add(tarefa);
        System.out.println("Tarefas::\n");
        System.out.println(descricao + "\n");
    }

    public void adicionarTarefaUrgente(String descricao, boolean concluida, int dias) {
        TarefaUrgente tarefaurgent = new TarefaUrgente(descricao, concluida, dias);
        tarefas.add(tarefaurgent);
    }
    
    public void carregarTarefas() {
        this.tarefas.addAll(repo.carregarTarefas());
    }
    
    public void salvarTarefas() {
        repo.salvarTarefas(this.tarefas);
    }
    
    public void imprimirTarefas() {
        Tarefa tarefa = new Tarefa(descricao, concluida);
        System.out.println(tarefa.descricao);
  
    }

    public void concluirTarefa() {
        this.concluida = true ;
    }
    
}
