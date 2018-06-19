package br.com.barcadero.genius.persistence.objects;

public class Filter {

	private Integer priceRange;
	private Integer rateRange;
	private Integer distanceRange;
	public Integer getPriceRange() {
		return priceRange;
	}
	public void setPriceRange(Integer priceRange) {
		this.priceRange = priceRange;
	}
	public Integer getRateRange() {
		return rateRange;
	}
	public void setRateRange(Integer rateRange) {
		this.rateRange = rateRange;
	}
	public Integer getDistanceRange() {
		return distanceRange;
	}
	public void setDistanceRange(Integer distanceRange) {
		this.distanceRange = distanceRange;
	}
	
	
}
