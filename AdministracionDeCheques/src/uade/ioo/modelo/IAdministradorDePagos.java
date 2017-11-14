package uade.ioo.modelo;

import java.util.List;

public interface IAdministradorDePagos {

	List<ChequeTerceros> obtenerChequesParaPagar(Double monto);
	Cheque generarChequeNuevo(Double monto);
	Double getMontoDisponiblePagos();
}
