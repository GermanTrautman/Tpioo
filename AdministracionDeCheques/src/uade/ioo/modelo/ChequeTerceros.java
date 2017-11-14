package uade.ioo.modelo;

public class ChequeTerceros extends Cheque {

	private EstadoChequeEnum estadoCheque = EstadoChequeEnum.RECIBIDO;

	public ChequeTerceros(long idCheque, String fechaEmision, double monto) {
		super(idCheque, fechaEmision, monto);
	}

	@Override
	public boolean sePuedePagarCon() {
		return false;
	}

	@Override
	public double getMontoDisponiblePago() {
		return 0;
	}

	public EstadoChequeEnum getEstadoCheque() {
		return estadoCheque;
	}

	public void setEstadoCheque(EstadoChequeEnum estadoCheque) {
		this.estadoCheque = estadoCheque;
	}

}
