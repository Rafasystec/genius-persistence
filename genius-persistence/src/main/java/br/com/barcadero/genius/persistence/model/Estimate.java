package br.com.barcadero.genius.persistence.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Estimate extends Entidade{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1051318043741618061L;
	@Column(precision=6,scale=2)
	private BigDecimal value;
	@Column(precision=6,scale=2)
	private BigDecimal discount;
	@Column(precision=6,scale=2)
	private BigDecimal increase;
	@Column(precision=4,scale=2)
	private BigDecimal percentGenius;
	@Column(precision=4,scale=2)
	private BigDecimal percentAPIPayment;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateAccepted;
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public BigDecimal getIncrease() {
		return increase;
	}
	public void setIncrease(BigDecimal increase) {
		this.increase = increase;
	}
	public BigDecimal getPercentGenius() {
		return percentGenius;
	}
	public void setPercentGenius(BigDecimal percentGenius) {
		this.percentGenius = percentGenius;
	}
	public BigDecimal getPercentAPIPayment() {
		return percentAPIPayment;
	}
	public void setPercentAPIPayment(BigDecimal percentAPIPayment) {
		this.percentAPIPayment = percentAPIPayment;
	}
	public Date getDateAccepted() {
		return dateAccepted;
	}
	public void setDateAccepted(Date dateAccepted) {
		this.dateAccepted = dateAccepted;
	}
	
}
