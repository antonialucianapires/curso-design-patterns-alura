package br.com.alura.loja.pedido;

public class SalvarPedido implements AcaoAposPedido{
    public void executar(Pedido pedido) {
        System.out.println("Pedido registrado com sucesso para cliente " + pedido.getCliente());
    }
}
