package tech.ada.banco.services.operacoesBancarias;

import tech.ada.banco.services.contaServices.ContaRepository;
import tech.ada.banco.services.contaServices.impl.ContaInMemoryImpl;

import java.math.BigDecimal;

public interface RealizaPagamento {
    public void pagarConta(long numeroConta, BigDecimal valor);
}
