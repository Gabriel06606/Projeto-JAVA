public class TarefaUrgente extends Tarefa { 
    
    public int diasPraConcluir;
    
    public TarefaUrgente(String descricao, boolean concluida) {
        super(descricao, concluida);
        this.diasPraConcluir = diasPraConcluir; 
    }
    
}
