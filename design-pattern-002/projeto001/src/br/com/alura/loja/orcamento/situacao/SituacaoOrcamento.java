package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.exception.DomainException;
import br.com.alura.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser reprovado");
    }

    public void finalizado(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser finalizado");
    }

}
