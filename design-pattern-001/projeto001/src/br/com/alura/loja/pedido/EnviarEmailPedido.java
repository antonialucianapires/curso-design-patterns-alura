package br.com.alura.loja.pedido;

public class EnviarEmailPedido implements AcaoAposPedido {

    public void executar(Pedido pedido) {
        System.out.println("E-mail com dados do pedido enviado para cliente [" + pedido.getCliente() + "]");
    }
    
}
