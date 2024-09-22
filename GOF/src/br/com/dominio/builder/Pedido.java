package br.com.dominio.builder;

import javax.swing.JOptionPane;

import br.com.dominio.abstrac_factory.Produto;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {
	private String numeroPedido;

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	private List<Produto> produtos;
	private Cliente cliente;
	private Vendedor vendedor;

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public BigDecimal getValorTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (Produto produto : produtos) {
			total = total.add(produto.getValor().multiply(new BigDecimal(produto.getQuantidade())));
		}

		return total;
	}

	public int getTotalProdutos() {
		int total = 0;
		for (Produto produto : produtos) {
			total += produto.getQuantidade();
		}

		return total;
	}
	
	public void PedidoInformacoes() {
		
		String mensagem = "Número do Pedido: " 
		+ this.getNumeroPedido() + "\n" + "CLIENTE:" + this.getCliente().getNome() + "\n" +
		"VENDEDOR:" + this.getVendedor().getVendedor() + "\n" +
		"Quantidade:" + this.getTotalProdutos();
		
		for(Produto produto:this.getProdutos()) {
			
			mensagem+= "\n" + produto.getNome();
		}
		
		JOptionPane.showMessageDialog(null, mensagem);
		
		
	}

}
