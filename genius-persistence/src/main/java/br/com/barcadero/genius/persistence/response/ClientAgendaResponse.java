package br.com.barcadero.genius.persistence.response;

public class ClientAgendaResponse {

	private Long professionalId = 0L;
    private Long clientId = 0L;
    private String clientName= "";
    private String professionalName = "";
    private String professionalPhotoUrl = "";
    private String clientPhotoUrl = "";
    private String status = "";
    private String agendaDate="";
    private Boolean confirmed=false;
	public Long getProfessionalId() {
		return professionalId;
	}
	public void setProfessionalId(Long professionalId) {
		this.professionalId = professionalId;
	}
	public Long getClientId() {
		return clientId;
	}
	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getProfessionalName() {
		return professionalName;
	}
	public void setProfessionalName(String professionalName) {
		this.professionalName = professionalName;
	}
	public String getProfessionalPhotoUrl() {
		return professionalPhotoUrl;
	}
	public void setProfessionalPhotoUrl(String professionalPhotoUrl) {
		this.professionalPhotoUrl = professionalPhotoUrl;
	}
	public String getClientPhotoUrl() {
		return clientPhotoUrl;
	}
	public void setClientPhotoUrl(String clientPhotoUrl) {
		this.clientPhotoUrl = clientPhotoUrl;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAgendaDate() {
		return agendaDate;
	}
	public void setAgendaDate(String agendaDate) {
		this.agendaDate = agendaDate;
	}
	public Boolean getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Boolean confirmed) {
		this.confirmed = confirmed;
	}
}
