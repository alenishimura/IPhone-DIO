package ClassesSecundárias;
import java.util.Scanner;

public class Navegador {
    public void exibirPagina(String url) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a URL da página: ");
        url = scanner.nextLine();
        System.out.println("Exibindo página: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
}
}
