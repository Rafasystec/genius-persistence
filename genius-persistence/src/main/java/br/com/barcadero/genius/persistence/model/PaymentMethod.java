package br.com.barcadero.genius.persistence.model;

import javax.persistence.Entity;

import br.com.barcadero.genius.persistence.enums.EnumPaymentMethod;

@Entity
public class PaymentMethod extends Entidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 375153177524254051L;
	private String description;
	private EnumPaymentMethod paymentMethod;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public EnumPaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(EnumPaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
}
