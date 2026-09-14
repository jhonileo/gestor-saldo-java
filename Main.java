package Gestor_de_Saldo;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        int opcao = 0;

        while (opcao != 4) {
            exibirMenu();

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(
                            "Saldo atual: R$ " + conta.consultarSaldo()
                    );
                    continuar(scanner);
                    break;

                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    BigDecimal valorDeposito = scanner.nextBigDecimal();

                    try {
                        conta.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso.");
                        System.out.println(
                                "Saldo atual: R$ " + conta.consultarSaldo()
                        );
                    } catch (IllegalArgumentException erro) {
                        System.out.println(erro.getMessage());
                    }

                    continuar(scanner);
                    break;

                case 3:
                    System.out.print("Digite o valor do saque: ");
                    BigDecimal valorSaque = scanner.nextBigDecimal();

                    try {
                        conta.sacar(valorSaque);
                        System.out.println("Saque realizado com sucesso.");
                        System.out.println(
                                "Saldo atual: R$ " + conta.consultarSaldo()
                        );
                    } catch (IllegalArgumentException erro) {
                        System.out.println(erro.getMessage());
                    }

                    continuar(scanner);
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    continuar(scanner);
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println();
        System.out.println("===== GESTOR DE SALDO =====");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Encerrar");
        System.out.print("Escolha uma opção: ");
    }

    private static void continuar(Scanner scanner) {
        scanner.nextLine();
        System.out.println();
        System.out.println("Pressione ENTER para continuar...");
        scanner.nextLine();
    }
}
