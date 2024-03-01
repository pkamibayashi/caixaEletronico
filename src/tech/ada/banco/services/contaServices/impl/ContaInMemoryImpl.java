package tech.ada.banco.services.contaServices.impl;

import tech.ada.banco.model.Conta;
import tech.ada.banco.services.contaServices.ContaRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class ContaInMemoryImpl implements ContaRepository{

    private List<Conta> contas = new ArrayList<Conta>();
    @Override
    public void criarConta(Conta c) {
        contas.add(c);
        System.out.println("Conta criada com sucesso");
    }

    @Override
    public void deletarConta(Conta c) {
        contas.remove(c);
        System.out.println("Conta deletada com sucesso");
    }

    @Override
    public Conta pesquisarPorNumeroConta(long accNumber) {
        for (Conta c : contas) {
            if (c.getNumeroConta() == accNumber) {
                return c;
            }
        }
        return null;
    }
}
