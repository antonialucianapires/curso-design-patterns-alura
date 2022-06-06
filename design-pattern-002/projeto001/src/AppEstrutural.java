import java.math.BigDecimal;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

public class AppEstrutural {

    public static void main(String[] args) {

        var orcamento = new Orcamento(BigDecimal.TEN, 1);

        orcamento.aprovar();
        orcamento.finalizar();

        //Adapter: é um intermediador, neste caso utilizamos uma interface Http para absrair a implementação de uma requisição http
        var registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(orcamento);
        
    }
    
}
