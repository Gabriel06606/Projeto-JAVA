public class TarefaUrgente extends Tarefa { 

    public int diasPraConcluir;
    
    public TarefaUrgente(String descricao, boolean concluida, int diasPraConcluir) {
        super(descricao, concluida);
        this.diasPraConcluir = diasPraConcluir;
    }
    
    public int getDiasParaConcluir() {
        return this.diasPraConcluir;
    }
    
    public void setDiasParaConcluir(int dias){
        this.diasPraConcluir = dias;
    }
    
}
