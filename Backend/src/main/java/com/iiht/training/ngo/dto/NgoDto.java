package com.iiht.training.ngo.dto;

import java.time.LocalDate;
import java.util.Objects;

public class NgoDto {

	private Long ngoId;
	private String ngoName;
	private String username;
	private String password;
	private String address;
	private Long phoneNumber;
	private LocalDate startedIn;
	private String documents;

	public Long getNgoId() {
		return ngoId;
	}

	public void setNgoId(Long ngoId) {
		this.ngoId = ngoId;
	}

	public String getNgoName() {
		return ngoName;
	}

	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getStartedIn() {
		return startedIn;
	}

	public void setStartedIn(LocalDate startedIn) {
		this.startedIn = startedIn;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, documents, ngoId, ngoName, password, phoneNumber, startedIn, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NgoDto other = (NgoDto) obj;
		return Objects.equals(address, other.address) && Objects.equals(documents, other.documents)
				&& Objects.equals(ngoId, other.ngoId) && Objects.equals(ngoName, other.ngoName)
				&& Objects.equals(password, other.password) && Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(startedIn, other.startedIn) && Objects.equals(username, other.username);
	}
	
	

}
