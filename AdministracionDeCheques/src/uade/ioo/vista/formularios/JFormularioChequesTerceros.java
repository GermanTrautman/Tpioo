package uade.ioo.vista.formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.modelo.Cheque;
import uade.ioo.modelo.ChequeTerceros;
import uade.ioo.vista.comportamiento.IVistaChequeTerceros;

public class JFormularioChequesTerceros extends JFormularioBase implements IVistaChequeTerceros {

	private static final long serialVersionUID = 1L;
	private JFormattedTextField formattedTextFieldNroCheque;
	private JDatePickerImpl datePickerFechaEmision;
	private JFormattedTextField formattedTextFieldMonto;
	private JLabel lblFechaEmision;
	private JLabel lblMonto;
	private JLabel lblNroCheque;

	/**
	 * Create the application.
	 */
	public JFormularioChequesTerceros(AdministradorPagos modelo) {
		super(modelo);
		setSize(420, 240);
		setLocationRelativeTo(getParent());
		getContentPane().setLayout(null);

		lblNroCheque = new JLabel("Nro cheque");
		lblNroCheque.setBounds(43, 38, 92, 14);
		getContentPane().add(lblNroCheque);

		try {
			formattedTextFieldNroCheque = new JFormattedTextField(new MaskFormatter("##########"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		formattedTextFieldNroCheque.setBounds(130, 35, 138, 20);
		getContentPane().add(formattedTextFieldNroCheque);

		lblFechaEmision = new JLabel("Fecha emisión");
		lblFechaEmision.setBounds(43, 69, 92, 14);
		getContentPane().add(lblFechaEmision);

		Properties p = new Properties();
		p.put("text.today", "Hoy");
		p.put("text.month", "Mes");
		p.put("text.year", "Año");
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		datePickerFechaEmision = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePickerFechaEmision.setBounds(130, 66, 138, 30);
		getContentPane().add(datePickerFechaEmision);

		lblMonto = new JLabel("Monto");
		lblMonto.setBounds(43, 107, 92, 14);
		getContentPane().add(lblMonto);

		try {
			formattedTextFieldMonto = new JFormattedTextField(new MaskFormatter("########.##"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		formattedTextFieldMonto.setBounds(130, 104, 138, 20);
		getContentPane().add(formattedTextFieldMonto);

		JButton btnRegistrarCheque = new JButton("Registrar");
		btnRegistrarCheque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				registrarCheque();
			}

		});

		btnRegistrarCheque.setBounds(130, 135, 138, 23);
		getContentPane().add(btnRegistrarCheque);

	}

	private void registrarCheque() {
		Cheque cheque;
		String mensaje;
		try {
			cheque = new ChequeTerceros(Long.parseLong( formattedTextFieldNroCheque.getText()),
					datePickerFechaEmision.getJFormattedTextField().getText(),
					Double.parseDouble(formattedTextFieldMonto.getText()));

			mensaje = "Cheque registrado";

		} catch (Exception ex) {
			mensaje = "Error";
			ex.printStackTrace();
		} finally {

			formattedTextFieldNroCheque.setValue(null);
			datePickerFechaEmision.getJFormattedTextField().setText(null);
			formattedTextFieldMonto.setValue(null);
		}

		JOptionPane.showMessageDialog(getParent(), mensaje);
	}

	@Override
	public void registrarChequeTerceros(ChequeTerceros chequeTerceros) {

		
	}
}
