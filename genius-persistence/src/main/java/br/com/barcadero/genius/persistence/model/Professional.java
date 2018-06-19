package br.com.barcadero.genius.persistence.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.barcadero.genius.persistence.embedded.GeneralPerson;
import br.com.barcadero.genius.persistence.enums.EnumPriceType;
import br.com.barcadero.genius.persistence.enums.EnumProfessionalArea;
import br.com.barcadero.genius.persistence.util.ColumnNameUtil;
/**
 * 
 * @author Rafael Rocha
 *
 */
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
	@Enumerated(EnumType.STRING)
	private EnumPriceType priceType;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name=ColumnNameUtil.PROFESSIONAL_ID,referencedColumnName=ColumnNameUtil.GENERAL_ID)
	private ProLocation locationPro;
	private Double rateResume;
	@Column(scale=2,precision=7)
	private BigDecimal value;
	
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
	public EnumPriceType getPriceType() {
		return priceType;
	}
	public void setPriceType(EnumPriceType priceType) {
		this.priceType = priceType;
	}
	public ProLocation getLocationPro() {
		return locationPro;
	}
	public void setLocationPro(ProLocation locationPro) {
		this.locationPro = locationPro;
	}
	public Double getRateResume() {
		return rateResume;
	}
	public void setRateResume(Double rateResume) {
		this.rateResume = rateResume;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
}
