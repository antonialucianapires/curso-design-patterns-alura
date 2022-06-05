import java.math.BigDecimal;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;

public class App {

    public static void main(String[] args) throws Exception {

        //Command - técnica de extração do caso de uso para uma classe específica
        var geraPedido = new GeraPedido("Gio", new BigDecimal("600"), 4); //resp por reunir os dados
        var handler = new GeraPedidoHandler(); //resp por executar as ações sobre os dados reunidos
        handler.executa(geraPedido);
        
  
    }
}
