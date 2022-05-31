import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.orcamento.Orcamento;

public class App {

    public static void main(String[] args) throws Exception {
        
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 1);

        var calculadoraImposto = new CalculadoraDeImpostos();
        var calculadoraDesconto = new CalculadoraDeDescontos();

        System.out.println("calculadora de impostos: " + calculadoraImposto.calcular(orcamento, new ICMS()));
        System.out.println("calculadora de descontos: " + calculadoraDesconto.calcular(orcamento));

    }
}
