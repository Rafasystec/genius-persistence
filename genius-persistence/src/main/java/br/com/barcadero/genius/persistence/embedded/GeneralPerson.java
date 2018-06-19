package br.com.barcadero.genius.persistence.embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.barcadero.genius.persistence.enums.EnumGender;

@Embeddable
public class GeneralPerson {

	@Column(length=100)
	private String name;
	@Column(length=50)
	private String nickName;
	@Column(length=10)
	private Integer birthDate;
	@Column
	@Enumerated(EnumType.STRING)
	private EnumGender gender;
	@Column(length=12)
	private String cpf;
	@Column(length=14)
	private String cnpj;
	@Column(length=2)
	private Integer ddd;
	@Column(length=14)
	private Long phoneNumber;
	@Column(length=250)
	private String urlProfilePhoto;
	@Embedded
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Integer getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Integer birthDate) {
		this.birthDate = birthDate;
	}
	public EnumGender getGender() {
		return gender;
	}
	public void setGender(EnumGender gender) {
		this.gender = gender;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Integer getDdd() {
		return ddd;
	}
	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getUrlProfilePhoto() {
		return urlProfilePhoto;
	}
	public void setUrlProfilePhoto(String urlProfilePhoto) {
		this.urlProfilePhoto = urlProfilePhoto;
	}
	
}
