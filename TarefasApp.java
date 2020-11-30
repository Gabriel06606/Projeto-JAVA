import java.net.http.WebSocket.Listener;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TarefasApp {

    public static void main(String[] args) {
        GerenciadorTarefa gerenciador1 = new GerenciadorTarefa();

        boolean chooseOption = true;
        while (chooseOption) {
            System.out.println("---Menu TarefasApp-- ");
            System.out.println("1. Criar uma nova Tarefa    ");
            System.out.println("2. Marcar tarefa como Concluida ");
            System.out.println("3. Excluir tarefas Concluidas   ");
            System.out.println("4. Listar tarefas    ");
            System.out.print("Digite a opção escolhida:  ");
            int input = userInput();
            switch (input) {
                case 1:
                    System.out.println(" 1.Tarefa");
                    System.out.println(" 2.Tarefa Urgente");
                    System.out.print("Digite a opção escolhida:  ");
                    input = userInput();
                    switch (input) {
                        case 1:
                            System.out.print("Descrição da tarefa: ");
                            Scanner listener = new Scanner(System.in);
                            String descricao = listener.nextLine();
                            boolean concluida = listener.nextLine() != null;
                            gerenciador1.adicionarTarefa(descricao, concluida);
                            break;
                        case 2:
                            System.out.print("Descrição da tarefa: ");
                            listener = new Scanner(System.in);
                            descricao = listener.nextLine();
                            concluida = false;
                            break;
                        default:
                            System.out.println("Opcao Invalida");
                            break;
                    }
                    break;

                case 2:
                gerenciador1.concluirTarefa();
                    break;
                case 3:

                    break;
                case 4:
                    gerenciador1.imprimirTarefas();
                    break;


                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
    }
}

    private static int userInput() {
        Scanner listener = new Scanner(System.in);
        int c = 0;
        try {
            c = listener.nextInt();
        } catch (InputMismatchException e) {
            try {
                c = Integer.getInteger(listener.nextLine());
            } catch (Exception k) {
                System.out.println("Utilize somente numeros inteiros");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return c;
        }
    }
}