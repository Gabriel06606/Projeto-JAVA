public class TarefaUrgente extends Tarefa { 

    public int diasPraConcluir;
    
    public TarefaUrgente(String descricao, boolean concluida, int dias) {
        super(descricao, concluida);
        this.diasPraConcluir = dias;
    }
    
    public TarefaUrgente(String descricao, boolean concluida, String dias) {
	}

	public int getDiasPraConcluir() {
        return this.diasPraConcluir;
    }
    
    public void setDiasPraConcluir(int dias){
        this.diasPraConcluir = dias;
    }
    
}
