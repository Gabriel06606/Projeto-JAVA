import java.util.ArrayList;

public class RepositoriodeTarefasDisco implements RepositoriodeTarefas {

@Override
public void salvarTarefas(ArrayList<Tarefa> tarefas) {
    System.out.println("Aguarde... Salvando tarefas");
}

@Override
public ArrayList<Tarefa> carregarTarefas() {
    ArrayList<Tarefa> TarefasCarregadas = new ArrayList<>();
    return TarefasCarregadas;
}


}