package br.com.barcadero.genius.persistence.enums;

public enum EnumPriceType {
	
	PRICE_PER_ESTIMATE("Orçamento","Orçamento"),
	PRICE_PER_HOUR("Preço por Hora"," por Hora"),
	PRICE_PER_DAY("Preço por dia","por Dia"),
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
