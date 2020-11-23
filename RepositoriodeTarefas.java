import java.util.ArrayList;

interface RepositoriodeTarefas {


    public RepositoriodeTarefas(List<Tarefa>){}

    public Tarefa salvarTarefas(){
        ArrayList<Tarefa> Tarefas = new ArrayList<Tarefa>();
    }

    public Tarefa carregarTarefas(){}
}
