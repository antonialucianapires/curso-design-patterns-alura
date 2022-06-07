package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class ISS extends Imposto{

    public ISS(Imposto imposto) {
        super(imposto);
    }

    @Override
    protected BigDecimal realizarCalcuclo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.6"));
    }    
}
