package model.services;

public class TaxaPayPal implements Taxas {

	@Override
	public Double calculoTaxas(int numeroParcela, Double valorParcela) {
		
		return valorParcela + (valorParcela * 1/100 * numeroParcela) + (valorParcela * 2/100);
	}

}
