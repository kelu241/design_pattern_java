package br.com.dominio.state;

public interface State {

	public State pegarGogumelo();

	public State pegarEstrala();

	public State pegarFlorDeFogo();

	public State colidirComInimigo();
	
	public String retornarTipo();


}
