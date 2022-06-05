package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

    public void executa(GeraPedido geraPedido) {
        var orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
        var pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Pedido registrado com sucesso para cliente " + pedido.getCliente());
        System.out.println("E-mail com dados do pedido enviado para cliente...");
    }
    
}
