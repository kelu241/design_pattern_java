package br.com.dominio.decorator;

import java.math.BigDecimal;

import br.com.dominio.abstrac_factory.Produto;

public class CalculoPrecoBrinde implements CalculoPreco{

	private CalculoPreco calculo;

	public CalculoPrecoBrinde(CalculoPreco calculo) {
		
		this.calculo = calculo;
	}

	@Override
	public BigDecimal valorFinal(Produto produto) {

		BigDecimal valorFinal = calculo.valorFinal(produto);
		
		BigDecimal brinde = new BigDecimal("100.00");
		
		valorFinal = valorFinal.add(brinde);
		
		return valorFinal;
		
		
	}


}
