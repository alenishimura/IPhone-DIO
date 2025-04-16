package ClassesSecundárias;
import java.util.Scanner;

public class Navegador {
    private String url;

    public void setPagina() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a URL da página: ");
            this.url = scanner.nextLine();
            System.out.println("Exibindo página: " + url);
        }
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        if (this.url != null) {
            System.out.println("Atualizando a página: " + this.url);
        } else {
            System.out.println("Nenhuma página definida para atualizar.");
        }
    }
}
