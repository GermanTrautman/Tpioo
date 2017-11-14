package uade.ioo.modelo;

public abstract class Cheque {

	private long idCheque;
	private String fechaEmision;
	private double monto;
	
	public Cheque(long idCheque, String fechaEmision, double monto) {
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
