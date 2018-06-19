package br.com.barcadero.genius.persistence.enums;

public enum EnumPriceType {
	
	PRICE_PER_ESTIMATE("Or�amento","Or�amento"),
	PRICE_PER_HOUR("Pre�o por Hora"," por Hora"),
	PRICE_PER_DAY("Pre�o por dia","por Dia"),
	PRICE_PER_CONTRACT("Somente Contrato","contrato");
	
	private final String description;
	private final String shortDescription;
	EnumPriceType(String description,String shortDescription){
		this.description = description;
		this.shortDescription = shortDescription;
	}
	public String getDescription() {
		return description;
	}
	public String getShortDescription() {
		return shortDescription;
	}

}
