package br.com.barcadero.genius.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.barcadero.genius.persistence.enums.EnumProfessionalArea;

@Entity
public class Occupation extends Entidade {
	@Column(length=60)
	private String description;
	@Enumerated(EnumType.STRING)
	@Column(length=60)
	private EnumProfessionalArea area;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public EnumProfessionalArea getArea() {
		return area;
	}
	public void setArea(EnumProfessionalArea area) {
		this.area = area;
	}

}
