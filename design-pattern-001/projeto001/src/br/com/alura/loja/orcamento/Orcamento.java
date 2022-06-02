package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    /**
     * State: utilizado quando temos uma transição de estados ou quando precisamos
     * aplicar alguma regra ou algum algoritmo baseado em um estado de um objeto de
     * uma classe.
     * assim como o strategy, busca reduzir problema com muitos ifs
     */
    public void aplicarDescontoExtra() {
        BigDecimal descontoExtra = this.situacao.calcularDescontoExtra(this);
        this.valor = this.valor.subtract(descontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizado(this);
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

}
