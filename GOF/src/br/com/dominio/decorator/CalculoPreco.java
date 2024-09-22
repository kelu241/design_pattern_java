package br.com.dominio.decorator;

import java.math.BigDecimal;

import br.com.dominio.abstrac_factory.Produto;

public interface CalculoPreco {
	
	public BigDecimal  valorFinal(Produto produto);
	
	

}
