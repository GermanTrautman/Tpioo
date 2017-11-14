package uade.ioo.vista.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.vista.comportamiento.IVistaChequeTerceros;

public class AgregarChequeTerceroController implements ActionListener {
	
	private IVistaChequeTerceros vista;
	private AdministradorPagos modelo;

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

	public AgregarChequeTerceroController(IVistaChequeTerceros vista, AdministradorPagos modelo) {
		this.vista = vista;
		this.modelo = modelo;
	}
	

	
	
}
