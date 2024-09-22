package br.com.dominio.decorator;

import java.math.BigDecimal;

import br.com.dominio.abstrac_factory.Produto;

public class CalculoPrecoComum implements CalculoPreco {

	@Override
	public BigDecimal valorFinal(Produto produto) {
		BigDecimal imposto = new BigDecimal("0.10");
		BigDecimal valorFinal = produto.getValor().add(produto.getValor().multiply(imposto));
		
		return valorFinal;
	}

}
