package ClassesSecundárias;

import java.util.Scanner;

public class Telefone {

    private String numero;
    Scanner scanner = new Scanner(System.in);
    
    public void ligar() {
        System.out.println("Digite o número do telefone: ");
        numero = scanner.nextLine();
        scanner.close();
        System.out.println("Ligando para " + numero + "...");
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
