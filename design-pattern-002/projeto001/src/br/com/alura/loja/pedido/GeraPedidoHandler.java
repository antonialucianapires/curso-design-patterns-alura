package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.Item;
import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

    private List<AcaoAposPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeraPedido geraPedido) {
        var orcamento = new Orcamento();
        orcamento.adicionarItem(new Item(geraPedido.getValorOrcamento()));
        var pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(acao -> acao.executar(pedido));
        
    }
    
}
