package Gestor_de_Saldo;

import java.math.BigDecimal;

public interface MeuSaldo {
    void verSaldo();
    void depositar(BigDecimal deposito);
    void sacar(BigDecimal saque);
}
