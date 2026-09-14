package Gestor_de_Saldo;
import java.util.Scanner;


public class Saldo implements MeuSaldo {

    double saldo = 0.00F;

    @Override
    public void verSaldo() {
        System.out.println("Seu saldo é de: R$" + saldo);
    }

    @Override
    public void depositar() {
        Scanner valor = new Scanner(System.in);
        double deposito = valor.nextDouble();

        while (deposito <= 1) {
            System.out.println("Valor inválido! O depósito deve ser positivo.");

            System.out.print("Digite novamente: ");
            deposito = valor.nextDouble();
        }
        saldo = (double) (saldo + deposito);

        System.out.println("Seu saldo agora é de: R$" + saldo);
    }

    @Override
    public void sacar() {
        Scanner valor = new Scanner(System.in);
        double saque = valor.nextDouble();

        while (saldo < saque) {
            System.out.println("Valor inválido! Saque superior ao seu saldo.");

            System.out.print("Digite novamente: ");
            saque = valor.nextDouble();
        }
        saldo = (double) (saldo - saque);
        System.out.println("Seu saldo agora é de: R$" + saldo);
    }
}
