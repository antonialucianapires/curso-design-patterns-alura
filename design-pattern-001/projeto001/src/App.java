import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.orcamento.Orcamento;

public class App {

    /**
     * Strategy
     * Sempre que temos um algoritmo que varia de acordo com um parâmetro ou informação
     * 
     */

    public static void main(String[] args) throws Exception {
        
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ICMS()));

    }
}
