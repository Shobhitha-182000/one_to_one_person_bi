package com.ty_one_to_one_person_bi_dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int person_id;
	private String name;
	private String address;
	private long phone;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn
	private AdharCard adharCard;

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public AdharCard getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(AdharCard adharCard) {
		this.adharCard = adharCard;
	}

	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", name=" + name + ", address=" + address + ", phone=" + phone
				 + "]";
	}
	
	
}
