package br.com.barcadero.genius.persistence.enums;

public enum EnumStatusAgenda {
	
	CONFIRMED("Confirmado"),
	CANCELED("Cancelado"),
	PAYED("Pago"),
	CANCELED_BY_CLI("Cliente Cancelou"),
	OTHER("Outro");
	private final String description;
	EnumStatusAgenda(final String description){
		this.description = description;
	}
	public String getDescription() {
		return description;
	}

}
