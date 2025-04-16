package ClassesSecundárias;

import java.util.Scanner;

public class Telefone {

    private String numero;
    private boolean chamadaAtiva = false;
    Scanner scanner = new Scanner(System.in);

    public void ligar() {
        System.out.println("Digite o número do telefone: ");
        numero = scanner.nextLine();
        if (numero == null || numero.isEmpty()) {
            System.out.println("Número inválido.");
        } else {
            System.out.println("Ligando para " + numero + "...");
            chamadaAtiva = true; 
        }
    }

    public void atender() {
        if (chamadaAtiva) {
            System.out.println("Atendendo chamada de " + numero + "...");
            System.out.println("Chamada em andamento.");
        } else {
            System.out.println("Nenhuma chamada para atender.");
        }
    }

    public void iniciarCorreioVoz() {
        if (!chamadaAtiva) {
            System.out.println("Nenhuma chamada ativa. Gravando mensagem no correio de voz...");
        } else {
            System.out.println("Não é possível iniciar o correio de voz enquanto há uma chamada ativa.");
        }
    }
}
