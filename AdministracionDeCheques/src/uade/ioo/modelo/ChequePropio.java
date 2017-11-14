package uade.ioo.modelo;

public class ChequePropio extends Cheque {

	private final EstadoChequeEnum estadoCheque = EstadoChequeEnum.ENTREGADO;

	public ChequePropio(int idCheque, String fechaEmision, double monto) {
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
}
