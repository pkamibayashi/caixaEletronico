package tech.ada.banco.model;

import java.math.BigDecimal;
import java.util.List;

public class Conta {
    private BigDecimal saldo;
    private long numeroConta;

    private String titular;

    public Conta(){
        saldo = BigDecimal.ZERO;
    }

    public Conta setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
        return this;
    }

    public Conta setTitular(String titular) {
        this.titular = titular;
        return this;
    }

    public void removeSaldo(BigDecimal saldo) {
        this.saldo = this.saldo.subtract(saldo);
    }

    public Conta setSaldoInicial(BigDecimal saldo){
        this.saldo = saldo;
        return this;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }



}
