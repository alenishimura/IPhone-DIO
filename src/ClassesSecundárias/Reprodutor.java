package ClassesSecundárias;
import java.util.Scanner;

public class Reprodutor { 

    private String musica;

    public void escolherMusica() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o nome da música: ");
            this.musica = scanner.nextLine();
            System.out.println("Você selecionou a música: " + this.musica);
        }
    }

    public void tocar() {
        if (this.musica != null) {
            System.out.println("Tocando a música: " + this.musica);
        } else {
            System.out.println("Nenhuma música foi selecionada.");
        }
    }

    public void pausar() {
        if (this.musica != null) {
            System.out.println("Música pausada: " + this.musica);
        } else {
            System.out.println("Nenhuma música foi selecionada.");
        }
    }
}
