package br.com.jagucheski.documentValidatorFormatter;

import br.com.caelum.stella.format.Formatter;

public class DocumentFormatter {

	private String document;

	public DocumentFormatter() {
	}

	public DocumentFormatter(String document) {
		this.document = document;
	}

	public String formatter(Formatter formatter) {
		return formatter.format(this.document);
	}

	public String unFormatter(Formatter formatter) {
		return formatter.unformat(this.document);
	}
	
	public boolean isFormatted(Formatter formatter) {
		return formatter.isFormatted(this.document);
	}

	public boolean canBeFormatted(Formatter formatter) {
		return formatter.canBeFormatted(this.document);
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

}
