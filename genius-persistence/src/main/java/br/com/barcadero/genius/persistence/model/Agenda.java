package br.com.barcadero.genius.persistence.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.barcadero.genius.persistence.enums.EnumStatusAgenda;
import br.com.barcadero.genius.persistence.util.ColumnNameUtil;

@Entity
public class Agenda extends Entidade{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6110414712868450828L;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name=ColumnNameUtil.PROFESSIONAL_ID, referencedColumnName=ColumnNameUtil.GENERAL_ID)
	private Professional professional;
	@Column
	private boolean confirmed;
	@Column
	private boolean canceled;
	@Column(length=1024)
	private String proofCode;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateConfirmed;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name=ColumnNameUtil.CLIENT_ID, referencedColumnName=ColumnNameUtil.GENERAL_ID)
	private Client client;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_ESTIMATE", referencedColumnName=ColumnNameUtil.GENERAL_ID)
	private Estimate estimate;
	@Enumerated(EnumType.STRING)
	@Column(length=50)
	private EnumStatusAgenda status;
	
	public Professional getProfessional() {
		return professional;
	}
	public void setProfessional(Professional professional) {
		this.professional = professional;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	public boolean isCanceled() {
		return canceled;
	}
	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}
	public String getProofCode() {
		return proofCode;
	}
	public void setProofCode(String proofCode) {
		this.proofCode = proofCode;
	}
	public Date getDateConfirmed() {
		return dateConfirmed;
	}
	public void setDateConfirmed(Date dateConfirmed) {
		this.dateConfirmed = dateConfirmed;
	}
	public Estimate getEstimate() {
		return estimate;
	}
	public void setEstimate(Estimate estimate) {
		this.estimate = estimate;
	}
	public EnumStatusAgenda getStatus() {
		return status;
	}
	public void setStatus(EnumStatusAgenda status) {
		this.status = status;
	}
	
	
}
