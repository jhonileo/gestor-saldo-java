package Gestor_de_Saldo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        Saldo sd = new Saldo();

        System.out.println("Bem vindo ao gestor de saldo em JAVA!");
        while (opcao != 4) {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("");
            System.out.println("Digite 1 para consultar seu saldo.");
            System.out.println("Digite 2 para fazer um deposito.");
            System.out.println("Digite 3 para sacar seu dinheiro.");
            System.out.println("Digite 4 para encerrar o programa");
            System.out.println("");

            opcao = scanner.nextInt();
            Scanner leitor = new Scanner(System.in);

            switch (opcao) {
                case 1:
                    System.out.println("Vamos consultar seu saldo!");
                    sd.verSaldo();
                    System.out.println("");

                    scanner.nextLine();
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Digite o valor do seu deposito: ");
                    sd.depositar();
                    System.out.println("");

                    scanner.nextLine();
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja sacar: ");
                    sd.sacar();
                    System.out.println("");

                    scanner.nextLine();
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Encerrando o programa... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    System.out.println("");
            }
        }
    }
}

