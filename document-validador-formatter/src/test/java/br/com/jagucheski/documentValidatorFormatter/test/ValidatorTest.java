package br.com.jagucheski.documentValidatorFormatter.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.jagucheski.documentValidatorFormatter.DocumentValidator;

public class ValidatorTest {

	@Test
	public void validCPFEmptyConstructor() {
		String cpf = "32827236605";
		DocumentValidator validator = new DocumentValidator();
		validator.validDocuments(new CPFValidator(), cpf);
		assertEquals(true, validator.isStatus());
	}

	@Test
	public void validCPF() {
		DocumentValidator validator = new DocumentValidator("32827236605");
		validator.validDocuments(new CPFValidator());
		assertEquals(true, validator.isStatus());
	}
	
	@Test
	public void validCNPJEmptyConstructor() {
		String cpf = "88158438000143";
		DocumentValidator validator = new DocumentValidator();
		validator.validDocuments(new CNPJValidator(), cpf);
		assertEquals(true, validator.isStatus());
	}
	
	@Test
	public void validCNPJ() {
		DocumentValidator validator = new DocumentValidator("88158438000143");
		validator.validDocuments(new CNPJValidator());
		assertEquals(true, validator.isStatus());
	}
	
	@Test
	public void validTituloEleitorEmptyConstructor() {
		String cpf = "608552080493";
		DocumentValidator validator = new DocumentValidator();
		validator.validDocuments(new TituloEleitoralValidator(), cpf);
		assertEquals(true, validator.isStatus());
	}
	
	@Test
	public void validTituloEleitor() {
		DocumentValidator validator = new DocumentValidator("608552080493");
		validator.validDocuments(new TituloEleitoralValidator());
		assertEquals(true, validator.isStatus());
	}

}
