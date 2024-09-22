package br.com.dominio.abstrac_factory;

public interface VendaFactory {
	
	public NFE criarNFE();
	public Boleto criarBoleto();

}
