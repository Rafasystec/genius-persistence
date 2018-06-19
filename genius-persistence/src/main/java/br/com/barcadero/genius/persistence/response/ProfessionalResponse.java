package br.com.barcadero.genius.persistence.response;

import br.com.barcadero.genius.persistence.enums.EnumProfessionalArea;

public class ProfessionalResponse {

	private Long id = 0L;
    private String name = "";
    private String value = "";
    private String distance = "";
    private String urlPhoto = "";
    private Double longitude=null;
    private Double latitude=null;
    private EnumProfessionalArea professionalArea=null;
    private Integer rate = 0;
    private Boolean isFavorite = false;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getUrlPhoto() {
		return urlPhoto;
	}
	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}
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
	public EnumProfessionalArea getProfessionalArea() {
		return professionalArea;
	}
	public void setProfessionalArea(EnumProfessionalArea professionalArea) {
		this.professionalArea = professionalArea;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public Boolean getIsFavorite() {
		return isFavorite;
	}
	public void setIsFavorite(Boolean isFavorite) {
		this.isFavorite = isFavorite;
	}
}
