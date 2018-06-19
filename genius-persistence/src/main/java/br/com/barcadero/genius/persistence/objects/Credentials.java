package br.com.barcadero.genius.persistence.objects;

import br.com.barcadero.genius.persistence.enums.EnumTypeDevice;

public class Credentials {

	
	private String username;
	private String password;
	private EnumTypeDevice device;
	public Credentials() {
		super();
	}
	
	public Credentials(String username, String password, EnumTypeDevice device) {
		super();
		this.username = username;
		this.password = password;
		this.device = device;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EnumTypeDevice getDevice() {
		return device;
	}
	public void setDevice(EnumTypeDevice device) {
		this.device = device;
	}
	
	
}
