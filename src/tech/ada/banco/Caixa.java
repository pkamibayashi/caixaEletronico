package tech.ada.banco;

import tech.ada.banco.model.Conta;
import tech.ada.banco.services.contaServices.impl.ContaInMemoryImpl;
import tech.ada.banco.services.operacoesBancarias.Impl.RealizaPagamentoImpl;

import java.math.BigDecimal;


public class Caixa {

    public static void main(String[] args) {
        ContaInMemoryImpl conta = new ContaInMemoryImpl();
        RealizaPagamentoImpl pagamento = new RealizaPagamentoImpl(conta);

        conta.criarConta(new Conta().setNumeroConta(123).setTitular("Ada Lovelace").setSaldoInicial(BigDecimal.valueOf(1000)));
        System.out.println("Saldo atual: " + conta.pesquisarPorNumeroConta(123).getSaldo());
        pagamento.pagarConta(123, BigDecimal.valueOf(100));
        System.out.println("Saldo após pagamento: " + conta.pesquisarPorNumeroConta(123).getSaldo());




    }
}
