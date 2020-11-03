package br.com.jagucheski.documentValidatorFormatter;

import br.com.caelum.stella.validation.Validator;

public class DocumentValidator {

	private String document;
	private boolean status;

	public DocumentValidator() {
	}

	public DocumentValidator(String document) {
		this.document = document;
	}

	public void validDocuments(Validator<String> validator) {
		try {
			validator.assertValid(this.document);
			status = true;
		} catch (Exception e) {
			status = false;
		}
	}

	public void validDocuments(Validator<String> validator, String document) {
		try {
			validator.assertValid(document);
			status = true;
		} catch (Exception e) {
			status = false;
		}
	}
	
	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public boolean isStatus() {
		return status;
	}
}
