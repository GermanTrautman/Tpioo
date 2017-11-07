package uade.ioo.vista.formularios;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import uade.ioo.modelo.Cheque;
import uade.ioo.modelo.ChequeTerceros;
import uade.ioo.modelo.EstadoChequeEnum;
import uade.ioo.principal.Programa;
import uade.ioo.vista.comportamiento.DateLabelFormatter;

import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;
import java.util.Properties;
import java.awt.event.ActionEvent;

public class JFormularioChequesRecibidos extends JFrame {

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
	public JFormularioChequesRecibidos(String text) {
		setSize(420, 240);
		setLocationRelativeTo(getParent());
		setTitle(text);
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
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				long idCheque;
				Date fechaEmision;
				double monto;
				String mensaje;
				try {
					idCheque = Long.valueOf((String) formattedTextFieldNroCheque.getValue());
					fechaEmision = new Date(datePickerFechaEmision.getJFormattedTextField().getText());
					monto = Double.parseDouble(formattedTextFieldMonto.getText());
					mensaje = "Cheque registrado";
					
					Cheque cheque = new ChequeTerceros(idCheque, fechaEmision, monto, EstadoChequeEnum.RECIBIDO);
					Programa.chequesTerceros.add(cheque);
					formattedTextFieldNroCheque.setValue(null);
					datePickerFechaEmision.getJFormattedTextField().setText(null);
					formattedTextFieldMonto.setValue(null);
				}catch (Exception ex) {
					mensaje = "Error";
				}
				
				JOptionPane.showMessageDialog(getParent(), mensaje);
			}
		});
		btnRegistrarCheque.setBounds(130, 135, 138, 23);
		getContentPane().add(btnRegistrarCheque);

	}
}
