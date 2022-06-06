package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        /**
         * Chain of Responsibility é um padrão de projeto comportamental que permite
         * que você passe pedidos por uma corrente de handlers. Ao receber um pedido,
         * cada handler decide se processa o pedido ou o passa adiante para o próximo
         * handler na corrente. Fonte: https://refactoring.guru/
         * 
         * Caso de uso: tem-se várias regras mas não sabe delas deve ser aplicada. É necessário verificar se uma regra foi aplicada, senão chama a próxima regra 
         * Obs.: Difere do Strategy porque nele nós sabemos a estratégia que deve ser aplicada de acordo com o parâmetro também conhecido
         */

        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoDeValorMaiorQueQuinhentos(
                        new SemDesconto()));

        return desconto.efetuarCalculo(orcamento);
    }

}
