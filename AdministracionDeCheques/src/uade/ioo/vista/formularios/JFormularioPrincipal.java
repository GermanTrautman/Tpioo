package uade.ioo.vista.formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import uade.ioo.modelo.AdministradorPagos;

public class JFormularioPrincipal extends JFormularioBase {

	private static final long serialVersionUID = 1L;

	private JMenuBar menuBar;
	private JMenu menuArchivo;
	private JMenuItem itemChequesRecibidos, itemPagarServicios, itemChequesAVencer, itemReporte, itemSalir;

	public JFormularioPrincipal(AdministradorPagos modelo) {
		super(modelo);
		this.setSize(640, 480);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menuBar = new JMenuBar();

		menuArchivo = new JMenu("Archivo");
		
		itemChequesRecibidos = new JMenuItem("Registrar cheques recibidos");
		itemPagarServicios = new JMenuItem("Pagar servicios");
		itemChequesAVencer = new JMenuItem("Cheques a vencer");
		itemReporte = new JMenuItem("Reporte de cheques");
		itemSalir = new JMenuItem("Salir");
		
		menuArchivo.addSeparator();

		menuArchivo.add(itemChequesRecibidos);
		menuArchivo.add(itemPagarServicios);
		menuArchivo.add(itemChequesAVencer);
		menuArchivo.add(itemReporte);
		menuArchivo.add(itemSalir);

		menuBar.add(menuArchivo);
		
		this.añadirEvento();
		
		setJMenuBar(menuBar);
	}
	
	protected void añadirEvento() {
		
		ActionListener action = new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFormularioChequesTerceros formChequesRecibidos = new JFormularioChequesTerceros(getModelo());
				formChequesRecibidos.setVisible(true);
			}
		};
			
		this.itemChequesRecibidos.addActionListener(action);
	}
}