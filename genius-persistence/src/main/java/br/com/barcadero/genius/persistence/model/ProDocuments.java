package br.com.barcadero.genius.persistence.model;

import javax.persistence.Entity;

@Entity
public class ProDocuments extends Entidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8214186168656326227L;
	private String description;
	private String fileName;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
