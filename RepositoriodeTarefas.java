import java.util.ArrayList;

public abstract interface RepositoriodeTarefas {

    public void salvarTarefas(ArrayList<Tarefa> tarefas);

    public ArrayList<Tarefa> carregarTarefas();
}
