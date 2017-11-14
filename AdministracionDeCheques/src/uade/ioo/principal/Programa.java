package uade.ioo.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.JFrame;

import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.modelo.Cheque;
import uade.ioo.modelo.ChequePropio;
import uade.ioo.modelo.ChequeTerceros;
import uade.ioo.modelo.Chequera;
import uade.ioo.vista.formularios.JFormularioPrincipal;

public class Programa {
	

	public static void main(String[] args) {
		Cheque cheque = new ChequeTerceros(123, "12-05-2011", 100);
				
		List<ChequeTerceros> chequeTerceros = new ArrayList<ChequeTerceros>();
		chequeTerceros.add((ChequeTerceros)cheque);
		Stack<ChequePropio> chequesNuevos = new Stack<ChequePropio>();
		Chequera chequera = new Chequera(chequesNuevos);
		AdministradorPagos admin = new AdministradorPagos(chequeTerceros,chequera );
		JFrame frm = new JFormularioPrincipal(admin);
		frm.setVisible(true);
	}

}