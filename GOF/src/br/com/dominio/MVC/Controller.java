package br.com.dominio.MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

	private View view;
	private Modelo model;


	public Controller(View view, Modelo model) {

		this.view = view;
		this.model = model;
		this.view.adicionaListener(new Listener());

	}

	class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int numero1, numero2 = 0;

			try {
				
				numero1 = view.getNumero1();
				numero2 = view.getNumero2();
				model.somaNumeros(numero1, numero2);
				view.setResultado(model.getValor());

			} catch (Exception e2) {
				
              view.mensagemErro("Insira dois númerois inteiros rapa");
              System.out.println(e2.getMessage());
			};

		}

	}

}
