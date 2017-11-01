package uade.ioo.modelo;

import java.util.Stack;

public class Chequera {

	private Stack<ChequePropio> chequesPropios;

	public Chequera(Stack<ChequePropio> chequesPropios) {
		super();
		this.chequesPropios = chequesPropios;
	}

	public Stack<ChequePropio> getChequesPropios() {
		return chequesPropios;
	}

	public void setChequesPropios(Stack<ChequePropio> chequesPropios) {
		this.chequesPropios = chequesPropios;
	}

	

}
