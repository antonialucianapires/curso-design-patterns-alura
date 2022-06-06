package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {   
    /**
     * O Strategy é um padrão de projeto comportamental que permite que você defina uma família de algoritmos, coloque-os em classes separadas, e faça os objetos deles intercambiáveis
     * 
     * Caso de uso: Sempre que temos um algoritmo que varia de acordo com um parâmetro ou informação, geralmente temos uma cadeia de ifs onde conhecemos os parâmetros e sabemos
     * o que deve ser feito para cada um deles
     * 
     * Motivação: Sempre que uma nova funcionalidade for implementada, o ideal é que possamos criar código novo e editar o mínimo possível de código já existente.
     * Aberto-Fechado (Open-Closed Principle)
     * 
     */
    
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
