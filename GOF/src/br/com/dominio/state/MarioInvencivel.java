package br.com.dominio.state;

public class MarioInvencivel implements State {

	@Override
	public State pegarGogumelo() {
		System.out.println("Mario Pegou o cogumelo virou super Mario!@!!!");
		return new SuperMario();
	}

	@Override
	public State pegarEstrala() {
		System.out.println("Mario Pegou a estela e ficou doidão!@!!!");
		return this;
	}

	@Override
	public State pegarFlorDeFogo() {
		System.out.println("Mario Pegou a  estrela de fogo e queimou geral!@!!!");
		return new FireMario();
	}

	@Override
	public State colidirComInimigo() {
		System.out.println("Mario se chocou com o inimigo e pedeu a invencibilidade!@!!!");
		return this;
	}

	@Override
	public String retornarTipo() {
		// TODO Auto-generated method stub
		return "MARIAO INVENCÍVEL";
	}

}
