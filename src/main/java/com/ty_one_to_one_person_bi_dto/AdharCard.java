package com.ty_one_to_one_person_bi_dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class AdharCard {
	@Id
	private int adhar_id;
	private String name;
	private String address;
	
	@OneToOne(mappedBy = "adharCard")
	private Person person;

	public int getAdhar_id() {
		return adhar_id;
	}

	public void setAdhar_id(int adhar_id) {
		this.adhar_id = adhar_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "AdharCard [adhar_id=" + adhar_id + ", name=" + name + ", address=" + address + ", person=" + person
				+ "]";
	}
	
}
