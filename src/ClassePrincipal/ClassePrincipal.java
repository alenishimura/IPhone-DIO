package ClassePrincipal;

import java.util.Scanner;

import ClassesSecundárias.Navegador;
import ClassesSecundárias.Reprodutor;
import ClassesSecundárias.Telefone;
import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInterface;
import Interfaces.ReprodutorInterface;

public class ClassePrincipal {
    public static void main(String[] args) throws Exception {
        System.out.println("Você está na tela inicial do IPhone, qual aplicativo você deseja abrir?");
        System.out.println("1 - Telefone\n2 - Navegador\n3 - Reprodutor de Música\n4 - Sair");
        
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                Telefone telefone = new Telefone();
                telefone.ligar();
                telefone.atender();
                telefone.iniciarCorreioVoz();
                break;
            case 2:
                Navegador navegador = new Navegador();
                navegador.setPagina("www.exemplo.com");
                navegador.adicionarNovaAba();
                navegador.atualizarPagina();
                break;
            case 3:
                Reprodutor reprodutor = new Reprodutor();
                reprodutor.setMusica("Música Exemplo");
                reprodutor.tocar();
                reprodutor.pausar();
                break;
            case 4:
                System.out.println("Saindo do aplicativo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
        
        

    }
}
