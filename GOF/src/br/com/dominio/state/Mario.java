package br.com.dominio.state;

public class Mario implements State {

	@Override
	public State pegarGogumelo() {
		System.out.println("Mario Pegou o CogumeloE e virou super mario !@!!!");
		return new SuperMario();
	}

	@Override
	public State pegarEstrala() {
		System.out.println("Mario Pegou a estrela e ficou doidão!@!!!");
		return new MarioInvencivel();
	}

	@Override
	public State pegarFlorDeFogo() {
		System.out.println("Mario Pegou a  estrela de fogo e queirma tudo !@!!!");
		return new FireMario();
	}

	@Override
	public State colidirComInimigo() {
		System.out.println("Mario se chocou com o inimigo e morreu!@!!!");
		return null;
	}

	@Override
	public String retornarTipo() {
		// TODO Auto-generated method stub
		return "MARIO PEQUENO";
	}


}
