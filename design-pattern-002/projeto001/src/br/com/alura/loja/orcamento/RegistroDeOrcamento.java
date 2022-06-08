package br.com.alura.loja.orcamento;

import java.util.Map;

import br.com.alura.loja.exception.DomainException;
import br.com.alura.loja.http.HttpAdapter;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        //chamada HTTP para API Externa

        if(!orcamento.isFinalizado()) {
            throw new DomainException("Orçamento não finalizado");
        }

        var url = "https://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
            "valor_orcamento", orcamento.getValor(),
            "quantidade_itens", orcamento.getItens().size()
        );

        http.post(url, dados);
    }
    
}
