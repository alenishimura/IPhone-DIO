package ClassesSecundárias;

import java.util.Scanner;

public class Telefone {
    private void ligar(String numero) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número para ligar: ");
        numero = scanner.nextLine();
        System.out.println("Ligando para " + numero + "...");
    }

    private void atender() {
        System.out.println("Atendendo chamada...");
    }
    
    private void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
