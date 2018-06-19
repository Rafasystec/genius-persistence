package br.com.barcadero.genius.persistence.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.barcadero.genius.persistence.embedded.GeneralPerson;
import br.com.barcadero.genius.persistence.enums.EnumProfessionalArea;

@Entity
public class Professional extends Entidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6967876265071626608L;
	@Embedded
	private GeneralPerson person;
	@Enumerated(EnumType.STRING)
	@Column(length=60)
	private EnumProfessionalArea area;
	public GeneralPerson getPerson() {
		return person;
	}
	public void setPerson(GeneralPerson person) {
		this.person = person;
	}
	public EnumProfessionalArea getArea() {
		return area;
	}
	public void setArea(EnumProfessionalArea area) {
		this.area = area;
	}
}
