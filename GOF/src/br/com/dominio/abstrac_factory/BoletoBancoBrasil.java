package br.com.dominio.abstrac_factory;

public class BoletoBancoBrasil implements Boleto {

	@Override
	public NFE emitir(Produto produto, double imposto) {
		System.out.println("Banco do Brasil");
		System.out.println("==================================================");
		System.out.println("Descrição:" + produto.getNome());
		System.out.println("Quantidade:" + produto.getQuantidade());
		System.out.println("Valor: R$" + produto.getValor());
		System.out.println("Imposto: R$" + imposto);
		System.out.println("Valor total: R$" + produto.getValorTotal());
		return null;
	}

}
