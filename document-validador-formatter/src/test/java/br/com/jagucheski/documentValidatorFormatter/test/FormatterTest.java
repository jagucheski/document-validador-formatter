package br.com.jagucheski.documentValidatorFormatter.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;
import br.com.jagucheski.documentValidatorFormatter.DocumentFormatter;

public class FormatterTest {

	@Test
	public void formatterCPF() {
		DocumentFormatter formatter = new DocumentFormatter("32827236605");
		formatter.formatter(new CPFFormatter());
		assertEquals("328.272.366-05", formatter.formatter(new CPFFormatter()));
	}

	@Test
	public void formatterCNPJ() {
		DocumentFormatter formatter = new DocumentFormatter("88158438000143");
		formatter.formatter(new CNPJFormatter());
		assertEquals("88.158.438/0001-43", formatter.formatter(new CNPJFormatter()));
	}

	@Test
	public void formatterTituloEleitoral() {
		DocumentFormatter formatter = new DocumentFormatter("608552080493");
		formatter.formatter(new TituloEleitoralFormatter());
		assertEquals("6085520804/93", formatter.formatter(new TituloEleitoralFormatter()));
	}

	@Test
	public void unformatterCPF() {
		DocumentFormatter formatter = new DocumentFormatter("328.272.366-05");
		formatter.unFormatter(new CPFFormatter());
		assertEquals("32827236605", formatter.unFormatter(new CPFFormatter()));
	}
	
	@Test
	public void unformatterCNPJ() {
		DocumentFormatter formatter = new DocumentFormatter("88.158.438/0001-43");
		formatter.unFormatter(new CNPJFormatter());
		assertEquals("88158438000143", formatter.unFormatter(new CNPJFormatter()));
	}
	
	@Test
	public void unformatterTituloEleitoral() {
		DocumentFormatter formatter = new DocumentFormatter("6085520804/93");
		formatter.unFormatter(new TituloEleitoralFormatter());
		assertEquals("608552080493", formatter.unFormatter(new TituloEleitoralFormatter()));
	}

}
