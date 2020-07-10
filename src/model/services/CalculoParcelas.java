package model.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.entities.Contrato;
import model.entities.Parcela;

public class CalculoParcelas {
	
	public List<Parcela> calcularValorParcelas(Contrato contrato) {
		List<Parcela> listaParcelas = new ArrayList<>();
		Calendar calendar = Calendar.getInstance();
		
		for (int i=1; i <= contrato.getQtdParcela(); i++) {
			
			calendar.setTime(contrato.getData());
			calendar.add(Calendar.MONTH, i);
			
			listaParcelas.add(new Parcela(calendar.getTime(), new TaxaPayPal().calculoTaxas(i, contrato.getValorTotal() / contrato.getQtdParcela()), contrato));

		}
		return listaParcelas;
	}

}
