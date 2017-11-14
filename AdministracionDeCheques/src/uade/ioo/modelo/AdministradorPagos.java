package uade.ioo.modelo;

import java.util.ArrayList;
import java.util.List;

public class AdministradorPagos implements IAdministradorDePagos{

	private List<ChequeTerceros> chequeTerceros = new ArrayList<ChequeTerceros>();
	private Chequera chequera;

	public AdministradorPagos(List<ChequeTerceros> cheques, Chequera chequera) {
		super();
		this.chequeTerceros = cheques;
		this.chequera = chequera;
	}

	public List<ChequeTerceros> getCheques() {
		return chequeTerceros;
	}

	public void registrarCheque(ChequeTerceros cheque) {
		this.chequeTerceros.add(cheque);
	}

	public Chequera getChequera() {
		return chequera;
	}

	public void setChequera(Chequera chequera) {
		this.chequera = chequera;
	}

	@Override
	public List<ChequeTerceros> obtenerChequesParaPagar(Double monto) {
		List<ChequeTerceros> chequesTemp = new ArrayList<ChequeTerceros>();
		
		for (int i = 0; i < chequeTerceros.size(); i++) {
			if (chequeTerceros.get(i).getMontoDisponiblePago() >= monto) {
				chequesTemp.add(chequeTerceros.get(i));
			}
		}
		return chequesTemp;
	}

	@Override
	public ChequeTerceros generarChequeNuevo(Double monto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getMontoDisponiblePagos() {
		// TODO Auto-generated method stub
		return null;
	}

}
