package br.com.dominio.abstrac_factory;

public class LojaCentroInformatica implements VendaFactory {

	@Override
	public NFE criarNFE() {
		NFE notaFiscal  = new NFESalvador();
		return notaFiscal;
	}

	@Override
	public Boleto criarBoleto() {
		Boleto boleto = new BoletoBancoBrasil();
		return boleto;
	}

}
