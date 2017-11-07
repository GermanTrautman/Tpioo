package uade.ioo.modelo;

import java.util.Date;

public abstract class Cheque {

	private long idCheque;
	private Date fechaEmision;
	private double monto;
	
	public Cheque(long idCheque, Date fechaEmision, double monto) {
		super();
		this.idCheque = idCheque;
		this.fechaEmision = fechaEmision;
		this.monto = monto;
	}
	public abstract boolean sePuedePagarCon();
	//dependiendo el estado del cheque devuelvo que monto puedo usar de ese cheque para pagar un servicio
	public abstract double getMontoDisponiblePago();
	
	//recibido = disponible 
	//cheque propio cuando lo genero el estado ya es entregado
	
}
