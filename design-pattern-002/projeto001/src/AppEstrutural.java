import java.math.BigDecimal;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.Item;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.OrcamentoProxy;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

public class AppEstrutural {

    public static void main(String[] args) {

        var orcamento = new Orcamento();
        orcamento.adicionarItem(new Item(new BigDecimal("200")));

        orcamento.aprovar();
        orcamento.finalizar();

        //Adapter: é um intermediador, neste caso utilizamos uma interface Http para absrair a implementação de uma requisição http
        var registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(orcamento);

        //Composite: compor objetos em estruturas de árvores e percorrer essa estrutura
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new Item(new BigDecimal("200")));

        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new Item(new BigDecimal("500")));
        novo.adicionarItem(antigo);

        OrcamentoProxy orcamentoProxy = new OrcamentoProxy(orcamento);

        System.out.println("orçamento novo reaproveitando orçamento antigo: " + orcamentoProxy.getValor());
        System.out.println("orçamento novo reaproveitando orçamento antigo: " + orcamentoProxy.getValor());

        
    }
    
}
