package modelo.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;
import model.services.CalculoParcelas;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Contrato contrato = new Contrato();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Informe o número do contrato: ");
		contrato.setNumeroContrato(sc.nextLong());
		System.out.print("Informe a data do contrato: ");
		contrato.setData(sdf.parse(sc.next()));
		System.out.print("Informe o valor do contrato: ");
		contrato.setValorTotal(sc.nextDouble());
		System.out.print("Informe o número de parcelas: ");
		contrato.setQtdParcela(sc.nextLong());
		
		List<Parcela> listaParcelas = new CalculoParcelas().calcularValorParcelas(contrato);
		
		System.out.println("Parcelas geradas");
		System.out.println("----------------");
		for (Parcela parcela : listaParcelas) {
			
			System.out.println("Parcela: " + parcela.getDataVcto() + " / " + parcela.getValorParcela());
			
		}
		
		sc.close();

	}

}
