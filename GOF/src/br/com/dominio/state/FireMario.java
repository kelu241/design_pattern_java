package br.com.dominio.state;

public class FireMario implements State {

	@Override
	public State pegarGogumelo() {
		System.out.println("Mario Pegou o Cogumelo perdeu a estrela de fogo!@!!!");
		return new SuperMario();
	}

	@Override
	public State pegarEstrala() {
		System.out.println("Mario Pegou a estela e ficou doidão!@!!!");
		return new MarioInvencivel();
	}

	@Override
	public State pegarFlorDeFogo() {
		System.out.println("Mario Pegou a  estrela de fogo ganhou mais 10000 pontos !@!!!");
		return this;
	}

	@Override
	public State colidirComInimigo() {
		System.out.println("Mario se chocou com o inimigo e virou Mario pequeno l!@!!!");
		return new Mario();
	}

	@Override
	public String retornarTipo() {
		// TODO Auto-generated method stub
		return "MARIO de FOGO";
	}

}
