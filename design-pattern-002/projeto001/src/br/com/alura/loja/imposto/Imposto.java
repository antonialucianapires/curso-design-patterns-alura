package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Imposto {

    private Imposto outro;

    public Imposto(Imposto imposto) {
        this.outro = imposto;
    }

    protected abstract BigDecimal realizarCalcuclo(Orcamento orcamento);

    //Decorator: decorar um objeto com outro objeto
    //Adiciona novas caracterísitcas sem alterar o código existente
    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalcuclo(orcamento);

        BigDecimal valorDoOutroImposto = BigDecimal.ZERO;

        if (this.outro != null) {
            valorDoOutroImposto = outro.realizarCalcuclo(orcamento);
        }

        return valorImposto.add(valorDoOutroImposto);
    }
}
