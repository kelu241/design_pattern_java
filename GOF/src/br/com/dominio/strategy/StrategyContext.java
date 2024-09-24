package br.com.dominio.strategy;

public class StrategyContext {
	
	
	
	private StrategyMath calculo;

	public StrategyContext(StrategyMath calculo) {

		this.calculo = calculo;
	}
	
	
	public int conta(int num1, int num2) {
		
		
		return calculo.Calcular(num1, num2);
		
		
	}
	
	

}
