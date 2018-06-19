package br.com.barcadero.genius.persistence.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.barcadero.genius.persistence.embedded.GeneralPerson;

@Entity
public class Client  extends Entidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1661879354206984858L;

	@Embedded
	private GeneralPerson person;
	
	@ManyToOne
	@JoinColumn(name = "ID_USER" ,referencedColumnName="ID")
	private User user;

	public GeneralPerson getPerson() {
		return person;
	}

	public void setPerson(GeneralPerson person) {
		this.person = person;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}