package ClassesSecundárias;
import java.util.Scanner;

public class Reprodutor {

    private String musica;
    Scanner scanner = new Scanner(System.in);

    public void setMusica() {
        System.out.print("Digite o nome da música: ");
        this.musica = scanner.nextLine();
        System.out.println("Você selecionou a música: " + this.musica);
        
    }
    public void tocar() {
        System.out.println("Tocando a música: " + this.musica);
    }
    public void pausar() {
        System.out.println("Música pausada: " + this.musica);
    }
 }