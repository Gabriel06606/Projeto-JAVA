import java.util.Scanner;
public class TarefasApp {
    public static void main(String[] args) {
        GerenciadorTarefa gerenciador = new GerenciadorTarefa();

        gerenciador.imprimirTarefas();
        gerenciador.limparTarefasConcluidas();

        private static void menu(GerenciadorTarefa gerenciador){
            System.out.println("Aplicativo Gerenciador de Tarefas:        ");
            System.out.println("1. Criar uma Nova Tarefa               ");
            System.out.println("2. Concluir uma Tarefa                 ");
            System.out.println("3. Listar Tarefas Não Concluidas       ");
            System.out.println("4. Listar Tarefas Concluidas           ");
            System.out.println("5. Salvar Lista de Tarefas             ");
            System.out.println("6. Carregar uma Lista de Tarefa        ");
            System.out.println("7. Limpar lisat de tarefas Concluidas  ");
            System.out.println("8. Fechar Aplicativo                   ");

            int opcao = userInput();
            switch (opcao){
                case 1:
                    System.out.println(" 1.Tarefa Comum");
                    System.out.println(" 2.Tarefa Urgente");
                    System.out.print("  Escolha uma opcao: ");
                    opcao = userInput();
                    switch (opcao){
                        case 1:
                            System.out.print("Adicione uma Descricao a sua tarefa: ");
                            Scanner listener = new Scanner(System.in);
                            String desc = listener.nextLine();
                            g.addTarefa(desc);
                            break;
                        case 2:
                            System.out.print("Adicione uma Descricao a sua tarefa: ");
                            listener = new Scanner(System.in);
                            desc = listener.nextLine();
                            System.out.print("Indique o prazo de conlcusao da Tarefa(dias): ");
                            opcao = userInput();
                            TarefaUrgente tu = new TarefaUrgente(desc,c);
                            g.addTarefa(tu);
                            break;
                        default:
                            System.out.println("Opcao Invalida");
                            break;
                    }
                    break;
                case 2:
                    gerenciador.concluirTarefa();
                    break;
                case 3:
                    System.out.println(" Imprimindo lista de tarefas...");
                    gerenciador.imprimirTarefas();
                    break;
                case 4:
                    System.out.println(" Imprimindo lista de tarefas concluidas...");
                    gerenciador.imprimirTarefasConcluidas();
                    break;
                case 5:
                    try {
                        gerenciador.salvarTarefas();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    try{
                        gerenciador.carregarTarefas();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    try {
                        gerenciador.limparTarefasConcluidas();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                case 8:
                    System.out.println("Fechando aplicativo...");
                    try {
                        gerenciador.carregarTarefas();
                        gerenciador.salvarTarefas();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    appLigado = false;
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }
        } 
    
        private static int userInput(){
            Scanner listener= new Scanner(System.in);
            int c = 0;
            try{
                c = listener.nextInt();
            }catch (InputMismatchException e){
                try {
                    c = Integer.getInteger(listener.nextLine());
                }catch (Exception k){
                    System.out.println("Utilize somente numeros inteiros");
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                return c;
            }
        } 
    
    } 

    }
    
}