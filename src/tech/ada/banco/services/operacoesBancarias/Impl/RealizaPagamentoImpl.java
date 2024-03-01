package tech.ada.banco.services.operacoesBancarias.Impl;

import tech.ada.banco.model.Conta;
import tech.ada.banco.services.contaServices.impl.ContaInMemoryImpl;
import tech.ada.banco.services.operacoesBancarias.RealizaPagamento;

import java.math.BigDecimal;

public class RealizaPagamentoImpl implements RealizaPagamento {

    ContaInMemoryImpl conta;

    public RealizaPagamentoImpl(ContaInMemoryImpl conta) {
        this.conta = conta;
    }


    @Override
    public void pagarConta(long numeroConta, BigDecimal valor) {
        Conta c = conta.pesquisarPorNumeroConta(numeroConta);
        c.removeSaldo(valor);
        System.out.println("Pagamento no valor de " + valor + " realizado com sucesso");

    }
}
