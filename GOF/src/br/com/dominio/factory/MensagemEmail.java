package br.com.dominio.factory;

import javax.swing.JOptionPane;

public class MensagemEmail implements Mensagem {

	@Override
	public void enviar(String mensagem) {
		JOptionPane.showMessageDialog(null, "E-MAIL: " + mensagem);
	}

}
