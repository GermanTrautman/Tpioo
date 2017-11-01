package uade.ioo.modelo;

import java.util.Date;

public abstract class Cheque {

	private int idCheque;
	private Date fechaEmision;
	private double monto;
	
	public abstract void sePuedePagarCon();
	public abstract double getMontoDisponiblePago();
	
	
}
