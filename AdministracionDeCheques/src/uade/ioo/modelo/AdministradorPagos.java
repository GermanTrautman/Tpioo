package uade.ioo.modelo;

import java.util.ArrayList;
import java.util.List;

public class AdministradorPagos implements IAdministradorDePagos{

	private List<Cheque> cheques;
	private Chequera chequera;

	public AdministradorPagos(List<Cheque> cheques, Chequera chequera) {
		super();
		this.cheques = cheques;
		this.chequera = chequera;
	}

	public List<Cheque> getCheques() {
		return cheques;
	}

	public void setCheques(List<Cheque> cheques) {
		this.cheques = cheques;
	}

	public Chequera getChequera() {
		return chequera;
	}

	public void setChequera(Chequera chequera) {
		this.chequera = chequera;
	}

	@Override
	public List<Cheque> obtenerChequesParaPagar(Double monto) {
		List<Cheque> chequesTemp = new ArrayList<Cheque>();
		
		for (int i = 0; i < cheques.size(); i++) {

		}
		return null;
	}

	@Override
	public Cheque generarChequeNuevo(Double monto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getMontoDisponiblePagos() {
		// TODO Auto-generated method stub
		return null;
	}

}
