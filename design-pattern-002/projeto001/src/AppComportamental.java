import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.EnviarEmailPedido;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.SalvarPedido;

public class AppComportamental {

    public static void main(String[] args) throws Exception {

        //Command - técnica de extração do caso de uso para uma classe específica
        var geraPedido = new GeraPedido("Gio", new BigDecimal("600"), 4); //resp por reunir os dados

        //Observer - um evento e n ouvintes inscritos que serão notificados / inversão de controles pq as classes inscritas irão reagir a um evento e não o evento chamar as mesmas
        var handler = new GeraPedidoHandler(Arrays.asList(
            new SalvarPedido(),
            new EnviarEmailPedido()
        )); 
        handler.executa(geraPedido);
        
  
    }
}
