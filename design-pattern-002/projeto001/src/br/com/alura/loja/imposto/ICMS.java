package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class ICMS extends Imposto{


    public ICMS(Imposto imposto) {
        super(imposto);
    }

    @Override
    protected BigDecimal realizarCalcuclo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
