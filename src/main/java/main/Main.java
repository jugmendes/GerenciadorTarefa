package main;

import controle.ControleTarefa;
import tarefa.Tarefa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n=== CONTROLE DE TAREFAS ===");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Buscar Tarefa pelo ID");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    Tarefa tarefa = new Tarefa(id, descricao);
                    ControleTarefa.getInstance().adicionarTarefa(tarefa);
                    System.out.println("Tarefa adicionada!");
                    break;

                case 2:
                    ControleTarefa.getInstance().listarTarefas();
                    break;

                case 3:
                    System.out.print("Digite o ID da tarefa: ");
                    int buscaId = scanner.nextInt();
                    scanner.nextLine();
                    Tarefa encontrada = ControleTarefa.getInstance().buscarTarefaPorId(buscaId);
                    if (encontrada != null) {
                        System.out.println("Tarefa encontrada: " + encontrada);
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;

                case 5:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
