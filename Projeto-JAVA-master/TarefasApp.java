import java.util.Scanner;
public class TarefasApp {
    public static void main(String[] args) {
        GerenciadorTarefa gerenciador = new GerenciadorTarefa();

        private static void menu(GerenciadorTarefa gerenciador){
            System.out.println("1. Criar uma Nova Tarefa               ");
            System.out.println("2. Concluir uma Tarefa                 ");
            System.out.println("3. Excluir tarefas concluidas      ");

            int opcao = userInput();
            int escolha;

            if(userInput() == 1) {
                System.out.println("Digite o nome da tarefa: ");
                    opcao = userInput();
                    System.out.print("Adicione uma Descricao a sua tarefa: ");
                    Scanner listener = new Scanner(System.in);
                    String desc = listener.nextLine();
                    System.out.println(desc);
                    break;
            } else if (userInput() == 2) {
                System.out.println("Escolha a tarefa a ser concluida: ");

            } else {
                System.out.println("Excluir as tarefas concluidas? 1 - Sim, 2 - Não");
                if(escolha == 1) {
                    gerenciador.limparTarefasConcluidas();
                } else if(escolha == 2) {
                    return;
                }
            }
        }
    
        private static int userInput(){
            Scanner listener= new Scanner(System.in);
        } 
    } 
    }
}