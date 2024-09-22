package br.com.dominio.abstrac_factory;

import java.math.BigDecimal;

public class NFESalvador implements NFE {

	@Override
	public double calcularImposto(Produto produto) {
		BigDecimal imposto = new BigDecimal("0.18");
		imposto = imposto.multiply(produto.getValor());
		return imposto.doubleValue();
	}

}
