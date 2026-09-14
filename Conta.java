package Gestor_de_Saldo;

import java.math.BigDecimal;

public class Conta implements MeuSaldo {

    private BigDecimal saldo = BigDecimal.ZERO;

    @Override
    public BigDecimal consultarSaldo() {
        return saldo;
    }

    @Override
    public void depositar(BigDecimal valor) {
        validarValorPositivo(valor);

        saldo = saldo.add(valor);
    }

    @Override
    public void sacar(BigDecimal valor) {
        validarValorPositivo(valor);

        if (valor.compareTo(saldo) > 0) {
            throw new IllegalArgumentException(
                    "Saldo insuficiente para realizar o saque."
            );
        }

        saldo = saldo.subtract(valor);
    }

    private void validarValorPositivo(BigDecimal valor) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException(
                    "O valor deve ser maior que zero."
            );
        }
    }
}
