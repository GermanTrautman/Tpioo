package uade.ioo.principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import uade.ioo.modelo.*;
import uade.ioo.vista.formularios.*;

public class Programa {
	
	public static List<Cheque> chequesTerceros;

	public static void main(String[] args) {
		chequesTerceros = new ArrayList<Cheque>();
		JFrame frm = new JFormularioPrincipal();
		frm.setVisible(true);
	}

}