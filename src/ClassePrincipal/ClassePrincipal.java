package ClassePrincipal;

import java.util.Scanner;
import ClassesSecundárias.Navegador;
import ClassesSecundárias.Reprodutor;
import ClassesSecundárias.Telefone;

public class ClassePrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\nVocê está na tela inicial do IPhone. Qual aplicativo você deseja abrir?");
            System.out.println("1 - Telefone\n2 - Navegador\n3 - Reprodutor de Música\n4 - Sair");
            System.out.print("Digite sua opção: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida! Por favor, digite um número entre 1 e 4.");
                scanner.next();
                continue;
            }

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    Telefone telefone = new Telefone();
                    telefone.ligar();
                    telefone.atender();
                    telefone.iniciarCorreioVoz();
                    break;

                case 2:
                    Navegador navegador = new Navegador();
                    navegador.setPagina();
                    navegador.adicionarNovaAba();
                    navegador.atualizarPagina();
                    break;

                case 3:
                    Reprodutor reprodutor = new Reprodutor();
                    reprodutor.escolherMusica();
                    reprodutor.tocar();
                    reprodutor.pausar();
                    break;

                case 4:
                    System.out.println("Saindo do aplicativo... Até logo!");
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção entre 1 e 4.");
            }
        }

        scanner.close();
    }
}
