package Gestor_de_Saldo;

import java.math.BigDecimal;

public interface MeuSaldo {
    //void verSaldo();
    BigDecimal consultarSaldo();
    void depositar(BigDecimal valor);
    void sacar(BigDecimal valor);
}
