package uade.ioo.vista.formularios;

import javax.swing.JFrame;

import uade.ioo.modelo.AdministradorPagos;

public abstract class JFormularioBase extends JFrame {

	private static final long serialVersionUID = 1L;

	private AdministradorPagos modelo;

	protected AdministradorPagos getModelo() {
		return modelo;
	}

	public JFormularioBase(AdministradorPagos modelo) {
		super();
		this.modelo = modelo;
	}

}
