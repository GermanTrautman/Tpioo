package uade.ioo.modelo;

import java.util.Date;

public class ChequeTerceros extends Cheque {

	private EstadoChequeEnum estadoCheque;

	public ChequeTerceros(int idCheque, Date fechaEmision, double monto, EstadoChequeEnum estadoCheque) {
		super(idCheque, fechaEmision, monto);
		this.estadoCheque = estadoCheque;
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
