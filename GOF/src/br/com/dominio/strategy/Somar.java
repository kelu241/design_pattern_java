package br.com.dominio.strategy;

public class Somar implements StrategyMath {

	@Override
	public int Calcular(int x, int y) {
		
		return x + y;
		
	}

}
