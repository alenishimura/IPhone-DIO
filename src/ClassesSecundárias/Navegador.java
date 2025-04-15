package ClassesSecundárias;
import java.util.Scanner;


public class Navegador {
    private String url;
    public void setPagina() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a URL da página: ");
        this.url = scanner.nextLine();
        System.out.println("Exibindo página: " + url);
        scanner.close();
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
}
}
