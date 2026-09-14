package Gestor_de_Saldo;
import java.math.BigDecimal;
import java.util.Scanner;





public class Main {

    public static void continuar(Scanner scanner){
        scanner.nextLine();
        System.out.println("Pressione ENTER para continuar...");
        scanner.nextLine();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        conta sd = new conta();
        int opcao = 0;


        System.out.println("Bem vindo ao gestor de saldo em JAVA!");
        while (opcao != 4) {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("");
            System.out.println("Digite 1 para consultar seu saldo em conta.");
            System.out.println("Digite 2 para fazer um deposito.");
            System.out.println("Digite 3 para sacar seu dinheiro.");
            System.out.println("Digite 4 para encerrar o programa");
            System.out.println("");

            opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    sd.verSaldo();
                    continuar(scanner);
                    break;
                case 2:
                    System.out.println("Digite o valor do seu deposito: ");
                    BigDecimal deposito = scanner.nextBigDecimal();
                    System.out.println("");
                    sd.depositar(deposito);
                    continuar(scanner);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja sacar: ");
                    BigDecimal saque = scanner.nextBigDecimal();
                    System.out.println("");
                    sd.sacar(saque);
                    continuar(scanner);
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

