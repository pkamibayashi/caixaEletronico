package tech.ada.banco.services.contaServices;

import tech.ada.banco.model.Conta;
import tech.ada.banco.services.operacoesBancarias.RealizaPagamento;

import java.util.List;

public interface ContaRepository {

    public void criarConta(Conta c);

    public void deletarConta(Conta c);

    public Conta pesquisarPorNumeroConta(long numeroConta);


}
