import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.TipoImpostoEnum;
import br.com.alura.loja.orcamento.Orcamento;

public class App {
    public static void main(String[] args) throws Exception {
        
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, TipoImpostoEnum.ISS));

    }
}
