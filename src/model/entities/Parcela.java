package model.entities;

import java.util.Date;

public class Parcela {
	private Date dataVcto;
	private Double valorParcela;
	private Contrato contrato;

	public Parcela() {
	}

	public Parcela(Date dataVcto, Double valorParcela, Contrato contrato) {
		this.dataVcto = dataVcto;
		this.valorParcela = valorParcela;
		this.contrato = contrato;
	}

	public Date getDataVcto() {
		return dataVcto;
	}

	public void setDataVcto(Date dataVcto) {
		this.dataVcto = dataVcto;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

}
