package Gestor_de_Saldo;
import java.math.BigDecimal;


public class conta implements MeuSaldo {

    private BigDecimal saldo = new BigDecimal("0.00");
    //private Scanner scanner;

    //public conta(Scanner scanner) {
        //this.scanner = scanner;
    //}



    @Override
    public void verSaldo() {
        System.out.println("Vamos consultar seu saldo!");
        System.out.println("");
        System.out.println("O saldo da sua conta é de: R$" + saldo);

    }

    @Override
    public void depositar(BigDecimal deposito) {

        if (deposito.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Valor inválido! O depósito deve ser positivo.");

        }
        else {
            saldo = saldo.add(deposito);
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Novo saldo: R$" + saldo);
        }
    }

    @Override
    public void sacar(BigDecimal saque) {

        if (saldo.compareTo(saque) < 0) { //saque.compareTo(BigDecimal.ZERO) <= 0
            System.out.println("Valor inválido! Saque superior ao seu saldo.");

        }
        else if (saque.compareTo(BigDecimal.ZERO) <= 0){
            System.out.println("Valor inválido! O valor do saque deve ser maior que zero.");

        }
        else {
            saldo = saldo.subtract(saque);
            System.out.println("Saque realizado com sucesso!");
            System.out.println("O saldo da sua conta agora é de: R$" + saldo);
        }
    }
}
