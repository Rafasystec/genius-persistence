package br.com.barcadero.genius.persistence.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.barcadero.genius.persistence.util.ColumnNameUtil;

@Entity
public class ProLocation extends Entidade{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8695918657371325303L;
	private Double longitude;
	private Double latitude;
	@OneToOne(fetch=FetchType.EAGER, mappedBy="locationPro")
	@JoinColumn(name=ColumnNameUtil.PROFESSIONAL_ID, referencedColumnName=ColumnNameUtil.GENERAL_ID)
	private Professional professional;
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Professional getProfessional() {
		return professional;
	}
	public void setProfessional(Professional professional) {
		this.professional = professional;
	}
}
