package br.com.dominio.MVC;

public class Modelo {
	
	private int valor;
	
	public void somaNumeros(int numero1, int numero2) {
		this.valor = numero1 + numero2;
	}
	
	public int getValor() {
		
		return this.valor;
	}

}
