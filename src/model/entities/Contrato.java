package model.entities;

import java.util.Date;

public class Contrato {
	private Long numeroContrato;
	private Date data;
	private Double valorTotal;
	private Long qtdParcela;

	public Contrato() {
	}

	public Contrato(Long numeroContrato, Date data, Double valorTotal, Long qtdParcela) {
		this.numeroContrato = numeroContrato;
		this.data = data;
		this.valorTotal = valorTotal;
		this.qtdParcela = qtdParcela;
	}

	public Long getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Long numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Long getQtdParcela() {
		return qtdParcela;
	}

	public void setQtdParcela(Long qtdParcela) {
		this.qtdParcela = qtdParcela;
	}

}
